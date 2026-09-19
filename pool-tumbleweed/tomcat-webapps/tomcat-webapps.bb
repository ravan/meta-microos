SUMMARY = "ROOT and examples web applications for Apache Tomcat"
DESCRIPTION = "The ROOT and examples web applications for Apache Tomcat"
LICENSE = "Apache-2.0"

PV = "9.0.121"

RPM_NAME = "tomcat-webapps-9.0.121-1.1.noarch.rpm"
RPM_HASH = "de7d4cd423490148e762c9e006f04aebb1114e3438fc931a81c2f055ab38597d15e14f2e2b7fe8296b2f76b012776860d53f0f2bf0218ee7e43f198430528462"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat-webapps \
tomcat-implementation-webapps \
tomcat-webapps"

RDEPENDS:${PN} += "/usr/bin/sh \
group-tomcat \
jakarta-taglibs-standard \
libxslt-tools \
tomcat \
util-linux"

inherit rpm
