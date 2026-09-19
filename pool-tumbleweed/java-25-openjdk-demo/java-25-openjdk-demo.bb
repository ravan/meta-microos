SUMMARY = "OpenJDK 25 Demos"
DESCRIPTION = "The OpenJDK 25 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openjdk-demo-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "e6f1cc2ac9159cc83b64950c00a4b14e738498c82e0e138e7f0c809e3357d25ce1cbf46c370f5428fb55fb2142d1d6eaa4b7d5fb56e1969e62a66a4dede2ea43"

RPROVIDES:${PN} += "java-25-openjdk-demo"

RDEPENDS:${PN} += "java-25-openjdk"

inherit rpm
