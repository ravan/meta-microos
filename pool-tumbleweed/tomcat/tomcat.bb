SUMMARY = "Apache Servlet/JSP/EL Engine, RI for Servlet 4.0/JSP 2.3/EL 3.0 API"
DESCRIPTION = "Tomcat is the servlet container that is used in the official Reference \
Implementation for the Java Servlet and JavaServer Pages technologies. \
The Java Servlet and JavaServer Pages specifications are developed by \
Sun under the Java Community Process. \
 \
ATTENTION: This tomcat is built with java 1.8.0."
LICENSE = "Apache-2.0"

PV = "9.0.121"

RPM_NAME = "tomcat-9.0.121-1.1.noarch.rpm"
RPM_HASH = "f814516e982c9ea719725328475babd0665e3cfc893d7c1d7e15943ea49bf98864db3966565dba02ccede5d541ff12b66cc1a993743a1fc099a844ab812c8921"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat \
group-tomcat \
tomcat \
tomcat-implementation \
user-tomcat"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
apache-commons-daemon \
apache-commons-dbcp \
apache-commons-logging \
apache-commons-pool2 \
fillup \
java \
libxslt-tools \
shadow \
tomcat-lib \
util-linux"

inherit rpm
