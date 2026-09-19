SUMMARY = "The host manager and manager web applications for Apache Tomcat"
DESCRIPTION = "The host manager and manager web-based applications for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.121"

RPM_NAME = "tomcat-admin-webapps-9.0.121-1.1.noarch.rpm"
RPM_HASH = "ff2bfddac2ed669968f032bedf0bdfdb60e263c3fbe187d7533b2c1df4e90a7c80fd0b3533436db87038f65163b6fa15c06364cff8c75299f42657fac58f8e9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat-admin-webapps \
tomcat-admin-webapps \
tomcat-implementation-admin-webapps"

RDEPENDS:${PN} += "/usr/bin/sh \
group-tomcat \
libxslt-tools \
tomcat \
util-linux"

inherit rpm
