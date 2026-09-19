SUMMARY = "OpenJDK 8 API Documentation"
DESCRIPTION = "The OpenJDK 8 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "1.8.0.504"

RPM_NAME = "java-1_8_0-openj9-javadoc-1.8.0.504-1.1.noarch.rpm"
RPM_HASH = "b339dc47569cb02b0c8380db1fa12000535ca6cea4b7ea9c4c14523ffd3b3a0795f0bab8294a27440f517dc04cf16be529c7aef567ac31a9ec1946730e6ee1b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-1-8-0-openj9-javadoc \
java-1.8.0-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils"

inherit rpm
