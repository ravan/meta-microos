SUMMARY = "OpenJDK 11 API Documentation"
DESCRIPTION = "The OpenJDK 11 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "11.0.32.1"

RPM_NAME = "java-11-openjdk-javadoc-11.0.32.1-2.1.noarch.rpm"
RPM_HASH = "0304e13506e564159ff70f8f788af15c9d9cf33307ab79a22b137df43368eee82af50236e326a7889249ae8786fb583c1ca2e472f39cd5c3df153e3e825b9834"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-11-javadoc \
java-11-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils"

inherit rpm
