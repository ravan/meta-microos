SUMMARY = "The 'docs' web application for Apache Tomcat"
DESCRIPTION = "The documentation of web application for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "10.1.59"

RPM_NAME = "tomcat10-docs-webapp-10.1.59-1.1.noarch.rpm"
RPM_HASH = "60cc6abcc5040c2c6a1f292cd8c0e3a1e58d2da0f3b11c9decec42e8f9c1e9b0e643c80a965c28e2be9fa4c119c82a44d0e5b14d0dad5d1eba97eee9f5452b2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-implementation-docs-webapp \
tomcat10-docs-webapp"

RDEPENDS:${PN} += "/usr/bin/sh \
libxslt-tools \
tomcat10 \
util-linux"

inherit rpm
