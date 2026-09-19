SUMMARY = "OpenJDK 8 API Documentation"
DESCRIPTION = "The OpenJDK 8 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "1.8.0.504"

RPM_NAME = "java-1_8_0-openjdk-javadoc-1.8.0.504-1.1.noarch.rpm"
RPM_HASH = "dde324ab8c63dd18ea6b0b69ad3e87042b4bec9c22cb4e2c726538c3b21c431b82187f02aeebb2bbaae936f9be4a27381508a8fad9f2d2420edc55c437ab1ccb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-1-8-0-openjdk-javadoc \
java-1.8.0-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils"

inherit rpm
