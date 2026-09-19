SUMMARY = "OpenJDK 25 API Documentation"
DESCRIPTION = "The OpenJDK 25 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openjdk-javadoc-25.0.4.1-1.1.noarch.rpm"
RPM_HASH = "03308e51cf145970cc14b240af88fb9b475ac091b8118bf90ad80f6d4427b8bdafd06cef19fba13aeaa990ea03c56557e78caf9f7eccf80355cf44780f06f6b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-25-javadoc \
java-25-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils"

inherit rpm
