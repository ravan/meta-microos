SUMMARY = "The 'docs' web application for Apache Tomcat"
DESCRIPTION = "The documentation of web application for Apache Tomcat."
LICENSE = "Apache-2.0"

PV = "11.0.25"

RPM_NAME = "tomcat11-docs-webapp-11.0.25-1.1.noarch.rpm"
RPM_HASH = "4b784a00148e8eca7920346287151f0977af4cb5f04c9bdbe9e585aac2947201400cd9d4385e339a5081d2d0db4aefdebc6d708cf130a94deb403ce33406d035"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tomcat-implementation-docs-webapp \
tomcat11-docs-webapp"

RDEPENDS:${PN} += "/usr/bin/sh \
libxslt-tools \
tomcat11 \
util-linux"

inherit rpm
