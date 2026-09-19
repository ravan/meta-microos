SUMMARY = "A Java logging library"
DESCRIPTION = "Logback is intended as a successor to the popular log4j project. At present \
time, logback is divided into three modules, logback-core, logback-classic \
and logback-access. \
 \
The logback-core module lays the groundwork for the other two modules. The \
logback-classic module can be assimilated to a significantly improved \
version of log4j. Moreover, logback-classic natively implements the SLF4J \
API so that you can readily switch back and forth between logback and other \
logging frameworks such as log4j or java.util.logging (JUL). \
 \
The logback-access module integrates with Servlet containers, such as \
Tomcat and Jetty, to provide HTTP-access log functionality. Note that you \
could easily build your own module on top of logback-core."
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "logback-1.6.0-1.1.noarch.rpm"
RPM_HASH = "03134a3ac37618329d6c05d15e0f45eb24f2625c0e833ee080aec4967a4d46815f626c53c4767252606f79aba7724577f5ba59b60e8a189fd804ac53b7e62871"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback \
mvn-ch.qos.logback-logback-classic \
mvn-ch.qos.logback-logback-classic-misc \
mvn-ch.qos.logback-logback-classic-misc-pom- \
mvn-ch.qos.logback-logback-classic-pom- \
mvn-ch.qos.logback-logback-core \
mvn-ch.qos.logback-logback-core-pom- \
mvn-ch.qos.logback-logback-parent-pom- \
osgi-ch.qos.logback.classic \
osgi-ch.qos.logback.core"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-org.slf4j-slf4j-api"

inherit rpm
