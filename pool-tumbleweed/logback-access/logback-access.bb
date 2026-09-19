SUMMARY = "Logback-access module for Servlet integration"
DESCRIPTION = "The logback-access module integrates with Servlet containers, such as Tomcat \
and Jetty, to provide HTTP-access log functionality. Note that you could \
easily build your own module on top of logback-core."
LICENSE = "EPL-1.0 | LGPL-2.1-or-later"

PV = "1.6.0"

RPM_NAME = "logback-access-1.6.0-1.1.noarch.rpm"
RPM_HASH = "13f16fd6a65dd5b2046015b9758b8a79617c8e94666333b7605c73a83ef60724276c317eefb449d3e15f2ac8a89d9ed8077d6e406a8906882dfa9fc6d9fe2bd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "logback-access \
mvn-ch.qos.logback-logback-access-pom-"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
mvn-ch.qos.logback-logback-parent-pom-"

inherit rpm
