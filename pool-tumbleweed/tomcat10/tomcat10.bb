SUMMARY = "Apache Servlet/JSP/EL Engine, RI for Servlet 6.0/JSP 3.1/EL 5.0 API"
DESCRIPTION = "Tomcat is the servlet container that is used in the official Reference \
Implementation for the Java Servlet and JavaServer Pages technologies. \
The Java Servlet and JavaServer Pages specifications are developed by \
Sun under the Java Community Process. \
 \
ATTENTION: This tomcat is built with java 1.11."
LICENSE = "Apache-2.0"

PV = "10.1.59"

RPM_NAME = "tomcat10-10.1.59-1.1.noarch.rpm"
RPM_HASH = "f20e375fea62ea2c3decf41ac454a50a9de364803d634ec363b6cafc31ae01cce3398215d7e27e13444c881f1b4a6a6383e509ee6b398f454bb4afd9ada38993"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat10 \
group-tomcat \
tomcat-implementation \
tomcat10 \
user-tomcat"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
apache-commons-daemon \
apache-commons-dbcp \
apache-commons-jexl \
apache-commons-logging \
apache-commons-pool2 \
fillup \
jakarta-servlet \
java \
libtcnative-1-0 \
libxslt-tools \
logrotate \
shadow \
tomcat10-lib \
util-linux"

inherit rpm
