SUMMARY = "OpenJDK 26 API Documentation"
DESCRIPTION = "The OpenJDK 26 API documentation."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "26.0.2.0"

RPM_NAME = "java-26-openjdk-javadoc-26.0.2.0-1.2.noarch.rpm"
RPM_HASH = "3deffd7b4868db2969fce295842e088111353756f6b0be88e3683441a76dbd83b03ebe41b023821fa9484798b73d87c71abc3ffabc051fc2d161f22c8b201aa5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "java-26-javadoc \
java-26-openjdk-javadoc \
java-javadoc"

RDEPENDS:${PN} += "/usr/bin/sh \
jpackage-utils"

inherit rpm
