SUMMARY = "The host manager and manager web applications for Apache Tomcat"
DESCRIPTION = "The host manager and manager web-based applications for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "10.1.59"

RPM_NAME = "tomcat10-admin-webapps-10.1.59-1.1.noarch.rpm"
RPM_HASH = "f7655251caa4c2a634896a11bc2dd360d99265c5f2ddb8800ec8f57cb6f4145856bcf10f91dc3821aef3fe48bbfa05789776d96d566f4ddb66140cfecc1e1f63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat10-admin-webapps \
tomcat-implementation-admin-webapps \
tomcat10-admin-webapps"

RDEPENDS:${PN} += "/usr/bin/sh \
group-tomcat \
libxslt-tools \
tomcat10 \
util-linux"

inherit rpm
