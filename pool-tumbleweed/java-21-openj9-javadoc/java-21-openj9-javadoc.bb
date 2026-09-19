SUMMARY = "OpenJDK 21 API Documentation"
DESCRIPTION = "The OpenJDK 21 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "21.0.12.1"

RPM_NAME = "java-21-openj9-javadoc-21.0.12.1-1.1.noarch.rpm"
RPM_HASH = "b361df4719aaebe9c9e657007bb07f9a73c34cac2ecde32c41c4ca253c93ea4f4698c4be5dab7db0ddede380557d821559019a4e497de0afd51564613fe3ebed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-21-javadoc \
java-21-openj9-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils"

inherit rpm
