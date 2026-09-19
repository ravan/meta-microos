SUMMARY = "The 'docs' web application for Apache Tomcat"
DESCRIPTION = "The documentation of web application for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "9.0.121"

RPM_NAME = "tomcat-docs-webapp-9.0.121-1.1.noarch.rpm"
RPM_HASH = "09e8c469e43ee6a7c335499a35f22f74fb75538d58985aff450b66bf6afbd850acefa5e8bf416a29c271fdb43873d1e31234bf4a1c70c94220638223b37061b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-docs-webapp \
tomcat-implementation-docs-webapp"

RDEPENDS:${PN} += "/usr/bin/sh \
libxslt-tools \
tomcat \
util-linux"

inherit rpm
