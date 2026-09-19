SUMMARY = "The host manager and manager web applications for Apache Tomcat"
DESCRIPTION = "The host manager and manager web-based applications for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "11.0.25"

RPM_NAME = "tomcat11-admin-webapps-11.0.25-1.1.noarch.rpm"
RPM_HASH = "a29b4cc204999ee6d583463bb4ef3afaf2c604e23595847c5978465e820adb31dca8147c3a2bbcf4d1a0aa612fc4867934cf787abd35b0f543dc941997eb4422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-tomcat11-admin-webapps \
tomcat-implementation-admin-webapps \
tomcat11-admin-webapps"

RDEPENDS:${PN} += "/usr/bin/sh \
group-tomcat \
libxslt-tools \
tomcat11 \
util-linux"

inherit rpm
