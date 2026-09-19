SUMMARY = "OpenJDK 21 API Documentation"
DESCRIPTION = "The OpenJDK 21 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "21.0.12.1"

RPM_NAME = "java-21-openjdk-javadoc-21.0.12.1-1.1.noarch.rpm"
RPM_HASH = "3a43903a578c8461d5e1d5df8ffe0dc8a9b285bc6730cf57f0c3301ec55274af02cd4b429cfc973615fcd51b972fb3a8444dde0f1852496f5e843370a1ecbf4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-21-javadoc \
java-21-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils"

inherit rpm
