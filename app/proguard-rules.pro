-optimizationpasses 5
-dontusemixedcaseclassnames
-dontskipnonpubliclibraryclasses
-dontpreverify
-verbose
-optimizations !code/simplification/arithmetic,!field/*,!class/merging/*

-keep public class * extends android.app.Activity
-keep public class * extends android.app.Application
-keep public class * extends android.app.Service
-keep public class * extends android.content.BroadcastReceiver
-keep public class * extends android.content.ContentProvider
-keep public class * extends android.app.backup.BackupAgentHelper
-keep public class * extends android.preference.Preference
-keep public class com.android.vending.licensing.ILicensingService

-keepclasseswithmembernames class * {
    native <methods>;
}

-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet);
}

-keepclasseswithmembers class * {
    public <init>(android.content.Context, android.util.AttributeSet, int);
}

-keepclassmembers class * extends android.app.Activity {
   public void *(android.view.View);
}

-keepclassmembers enum * {
    public static **[] values();
    public static ** valueOf(java.lang.String);
}

-keep class * implements android.os.Parcelable {
  public static final android.os.Parcelable$Creator *;
}

 -dontwarn **CompatHoneycomb
 -dontwarn org.htmlcleaner.*
 -dontwarn org.w3c.dom.bootstrap.DOMImplementationRegistry
 -dontwarn com.github.siyamed.shapeimageview.path.parser.SvgToPath

 -keepattributes SourceFile,LineNumberTable
 -keep class com.parse.*{ *; }
 -dontwarn com.parse.**
 -dontwarn com.squareup.picasso.**
 -keepclasseswithmembernames class * {
     native <methods>;
 }

 -dontwarn org.apache.commons.**
 -keep class org.apache.http.** { *; }
 -dontwarn org.apache.http.**
 -keep public class com.google.android.gms.**
 -dontwarn com.google.android.gms.**


-keepclassmembers,allowobfuscation class * {
    @org.codehaus.jackson.annotate.* <fields>;
    @org.codehaus.jackson.annotate.* <init>(...);
}

#if you use public fields instead of setter/getters for your REST POJOs, add this
-keepclassmembers class <ir.behtateam.instaplus.utils>.** {
      private <fields>;
}

-keepclassmembers,allowobfuscation class * {
    @org.simpleframework.xml.* <fields>;
    @org.simpleframework.xml.* <init>(...);
}

## Gson SERIALIZER SETTINGS
# See https://code.google.com/p/google-gson/source/browse/trunk/examples/android-proguard-example/proguard.cfg
# Gson uses generic type information stored in a class file when working with fields. Proguard
# removes such information by default, so configure it to keep all of it.
-keepattributes Signature
# Gson specific classes
-keep class sun.misc.Unsafe { *; }


# Needed by google-api-client to keep generic types and @Key annotations accessed via reflection

-keepclassmembers class * {
  @com.google.api.client.util.Key <fields>;
}

-keepattributes Signature,RuntimeVisibleAnnotations,AnnotationDefault

# Needed by Guava

-dontwarn sun.misc.Unsafe

# See https://groups.google.com/forum/#!topic/guava-discuss/YCZzeCiIVoI
-dontwarn com.google.common.collect.MinMaxPriorityQueue




-keep class org.springframework.jndi.JndiPropertySource
-keep class org.springframework.jndi.JndiLocatorDelegate { *; }
-keep class org.springframework.context.** { *; }
-keep class org.springframework.format.support.** { *; }
-keep class org.springframework.ui.context.support.** { *; }
-keep class org.springframework.validation.** { *; }
-keep class org.springframework.http.**  { *; }
-keep class org.springframework.ui.velocity.** { *; }
-keep class org.springframework.web.bind.** { *; }
-keep class org.springframework.web.context.** { *; }
-keep class org.springframework.web.context.ContextLoaderListener { *; }
-keep class org.springframework.web.context.support.XmlWebApplicationContext { *; }
-keep class org.springframework.web.context.support.GenericWebApplicationContext { *; }
-keep class org.springframework.web.context.support.StaticWebApplicationContext { *; }
-keep class org.springframework.web.context.support.AbstractRefreshableWebApplicationContext { *; }
-keep class org.springframework.web.context.WebApplicationContext { *; }
-keep class org.springframework.web.filter.** { *; }
-keep class org.springframework.web.servlet.i18n.**
-keep class org.springframework.web.method.** { *; }
-keep class org.springframework.web.servlet.DispatcherServlet { *; }
-keep class org.springframework.web.servlet.config.**
-keep class org.springframework.web.servlet.support.*
-keep class org.springframework.web.servlet.theme.**
-keep class org.springframework.web.servlet.view.*
-keep class org.springframework.web.servlet.view.x**
-keep class org.springframework.web.servlet.view.velocity.**  { *; }
-keep class org.springframework.web.util.** { *; }
-keep class org.springframework.web.view.*
-keep class * implements org.springframework.web.context.ConfigurableWebApplicationContext { *; }
-keep class * implements org.springframework.context.ApplicationListener { *; }
-keep class * extends org.springframework.web.context.support.XmlWebApplicationContext { *; }

-keep class * extends org.springframework.web.servlet.DispatcherServlet { *; }
-keep class org.springframework.beans.factory.** { *; }
-keep class org.apache.velocity.runtime.directive.** { *; }
-keep class org.apache.velocity.runtime.ParserPoolImpl
-keep class org.reflections.spring.**
-keep class * implements javax.servlet.FilterChain { *; }


-keepclassmembers class * {
    @org.springframework.beans.factory.annotation.Autowired *;
    @org.springframework.beans.factory.annotation.Qualifier *;
    @org.springframework.beans.factory.annotation.Value *;
    @org.springframework.beans.factory.annotation.Required *;
    @org.springframework.context.annotation.Bean *;
    @javax.annotation.PostConstruct *;
    @javax.annotation.PreDestroy *;
    @org.aspectj.lang.annotation.AfterReturning *;
    @org.aspectj.lang.annotation.Pointcut *;
    @org.aspectj.lang.annotation.AfterThrowing *;
    @org.aspectj.lang.annotation.Around *;
}
-keep @org.springframework.stereotype.Service class *
-keep @org.springframework.stereotype.Controller class *
-keep @org.springframework.stereotype.Component class *
-keep @org.springframework.stereotype.Repository class *
-keep @org.springframework.cache.annotation.EnableCaching class *




-keepclassmembers class * implements java.io.Serializable {
    static final long serialVersionUID;
    private static final java.io.ObjectStreamField[] serialPersistentFields;
    !static !transient <fields>;
    private void writeObject(java.io.ObjectOutputStream);
    private void readObject(java.io.ObjectInputStream);
    java.lang.Object writeReplace();
    java.lang.Object readResolve();
}




-keep class com.google.api.client.util.**
-keep class com.google.apphosting.utils.jetty.AppEngineWebAppContext { *; }
-keep class com.google.appengine.tools.development.DevAppEngineWebAppContext { *; }
-keep class org.mortbay.jetty.handler.ContextHandler { *; }
-keep class com.google.api.client.auth.**
-keep class com.google.api.client.auth.oauth2.TokenResponseException { *; }
-keep class com.google.api.client.http.** { *; }
-keep class com.google.api.client.json.** { *; }
-keep class com.google.api.client.util.** { *; }
-keep class com.google.api.server.spi.SystemServiceServlet
-keep class com.google.appengine.tools.mapreduce.MapReduceServlet
-keep class * extends com.google.api.server.spi.SystemServiceServlet
-keep class * extends javax.servlet.http.HttpServlet
-keep class * implements javax.servlet.ServletContext { *; }



-keepattributes *Annotation*
-keep class com.yumyumlabs.** { *; }

-keepclassmembers class com.yumyumlabs.** { java.lang.Long id; }
-keepnames class com.yumyumlabs.** implements java.io.Serializable
-keep class com.mufumbo.server.**
-keep class org.machino.**

-keep class org.slf4j.Logger { *; }
-keep class * implements org.slf4j.Logger { *; }
-keep class org.slf4j.spi.LocationAwareLogger { *; }
-keep class org.slf4j.spi.LoggerFactoryBinder { *; }
-keep class * implements org.slf4j.spi.LocationAwareLogger { *; }
-keep class * implements org.slf4j.spi.LoggerFactoryBinder { *; }
-keep class org.slf4j.impl.Log4jLoggerAdapter { *; }
-keep class org.apache.log4j.Logger { *; }
-keep class org.apache.log4j.ConsoleAppender { *; }
-keep class org.apache.log4j.PatternLayout
-keep class org.apache.commons.logging.LogFactory { *; }



-keep class sun.misc.Unsafe { *; }
-keep class com.google.gson.stream.** { *; }

-keep class com.google.gson.internal.**