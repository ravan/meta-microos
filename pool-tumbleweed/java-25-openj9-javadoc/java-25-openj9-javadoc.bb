SUMMARY = "OpenJDK 25 API Documentation"
DESCRIPTION = "The OpenJDK 25 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openj9-javadoc-25.0.4.1-1.1.noarch.rpm"
RPM_HASH = "4591f25b7f11af0f383627a8737a9c74e0a78e0e8743ba73e31b08620871f1b0fff4ac76db9525207562c9a85bbf7b8dee1c207656b20b203e5f1a1147cd1696"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-25-javadoc \
java-25-openj9-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils"

inherit rpm
