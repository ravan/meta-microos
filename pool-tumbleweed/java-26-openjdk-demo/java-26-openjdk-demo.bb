SUMMARY = "OpenJDK 26 Demos"
DESCRIPTION = "The OpenJDK 26 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "26.0.2.0"

RPM_NAME = "java-26-openjdk-demo-26.0.2.0-1.2.aarch64.rpm"
RPM_HASH = "80c13438241ef917f693766dc80fc3eac5bcf0cb8556cec4e53e0fd064999a814bc9975b84f543a84a8b8a09d9b8feda472d32a3209ed2aa8f974f05c157e841"

RPROVIDES:${PN} += "java-26-openjdk-demo"

RDEPENDS:${PN} += "java-26-openjdk"

inherit rpm
