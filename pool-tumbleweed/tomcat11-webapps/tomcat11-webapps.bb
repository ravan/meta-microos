SUMMARY = "ROOT and examples web applications for Apache Tomcat"
DESCRIPTION = "The ROOT and examples web applications for Apache Tomcat"
LICENSE = "Apache-2.0"

PV = "11.0.25"

RPM_NAME = "tomcat11-webapps-11.0.25-1.1.noarch.rpm"
RPM_HASH = "4925cb7614ab75ce717d66ca138618df7a75081feb16e6543b05203ee8c025c5fac43600a1d6df2eb8ccfa8b264fa22f69c3aaf2f5281a46571eeef31186a91a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat11-webapps \
tomcat-implementation-webapps \
tomcat11-webapps"

RDEPENDS:${PN} += "/usr/bin/sh \
group-tomcat \
jakarta-taglibs-standard \
libxslt-tools \
tomcat11 \
util-linux"

inherit rpm
