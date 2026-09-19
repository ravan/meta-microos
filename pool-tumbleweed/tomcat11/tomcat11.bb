SUMMARY = "Apache Servlet/JSP/EL Engine, RI for Servlet 6.1/JSP 4.0/EL 6.0 API"
DESCRIPTION = "Tomcat is the servlet container that is used in the official Reference \
Implementation for the Java Servlet and JavaServer Pages technologies. \
The Java Servlet and JavaServer Pages specifications are developed by \
Sun under the Java Community Process. \
 \
ATTENTION: This tomcat is built with java 1.17."
LICENSE = "Apache-2.0"

PV = "11.0.25"

RPM_NAME = "tomcat11-11.0.25-1.1.noarch.rpm"
RPM_HASH = "af8f6a569b3a41d1c970a2c445e914427eb9fa9e53fd57854c67ba1c46133f8db805a70f5a81369d9e50a6521814f6410562c5d6cc45f6eaf18c7bfd47e29510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat11 \
group-tomcat \
tomcat-implementation \
tomcat11 \
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
libtcnative-2-0 \
libxslt-tools \
logrotate \
shadow \
tomcat11-lib \
util-linux"

inherit rpm
