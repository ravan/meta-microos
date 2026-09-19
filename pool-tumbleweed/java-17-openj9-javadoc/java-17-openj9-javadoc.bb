SUMMARY = "OpenJDK 17 API Documentation"
DESCRIPTION = "The OpenJDK 17 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "17.0.20.1"

RPM_NAME = "java-17-openj9-javadoc-17.0.20.1-1.1.noarch.rpm"
RPM_HASH = "823b71cfd20a2450c738b42ae5397e514e083201118caf44c1be3fb316caecb2627a01cb1e1e8972a6a837ca2a9951639070c6678d43465b6bb7fb1bd4d271ca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-17-javadoc \
java-17-openj9-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils"

inherit rpm
