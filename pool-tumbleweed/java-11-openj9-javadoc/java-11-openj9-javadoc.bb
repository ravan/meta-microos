SUMMARY = "OpenJDK 11 API Documentation"
DESCRIPTION = "The OpenJDK 11 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "11.0.32.1"

RPM_NAME = "java-11-openj9-javadoc-11.0.32.1-1.1.noarch.rpm"
RPM_HASH = "651f1078e8038d6ef854b43397f56de6d517c29d55b4d79d27de82a7071142d485e15641b46479127dde291ec0870979f37d1e7622e25a99a59c713de1fba5fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-11-javadoc \
java-11-openj9-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils"

inherit rpm
