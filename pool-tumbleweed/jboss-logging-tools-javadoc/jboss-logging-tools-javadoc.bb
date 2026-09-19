SUMMARY = "Javadoc for jboss-logging-tools"
DESCRIPTION = "This package contains the API documentation for jboss-logging-tools."
LICENSE = "Apache-2.0 & LGPL-2.0-or-later"

PV = "2.2.1"

RPM_NAME = "jboss-logging-tools-javadoc-2.2.1-4.14.noarch.rpm"
RPM_HASH = "d4a781b31751aad13e09a782200c7d24dd8504f7aa1ec459ea95db784d4374f643f0bb91f7dfba63c987502e080f5b084d2297a1c5566b61d0473ff207b9cc2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "jboss-logging-tools-javadoc"

RDEPENDS:${PN} += "javapackages-filesystem"

inherit rpm
