SUMMARY = "ROOT and examples web applications for Apache Tomcat"
DESCRIPTION = "The ROOT and examples web applications for Apache Tomcat"
LICENSE = "Apache-2.0"

PV = "10.1.59"

RPM_NAME = "tomcat10-webapps-10.1.59-1.1.noarch.rpm"
RPM_HASH = "48a32e29e77a0747a3a36fbac29ba52bd2d7d066df878921f573b15a405ce084ae9a3025566fc667d32c1e81b37d6981086d32375a517c4e290dfe7a14b5d6e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat10-webapps \
tomcat-implementation-webapps \
tomcat10-webapps"

RDEPENDS:${PN} += "/usr/bin/sh \
group-tomcat \
jakarta-taglibs-standard \
libxslt-tools \
tomcat10 \
util-linux"

inherit rpm
