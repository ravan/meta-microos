SUMMARY = "OpenJDK 21 Demos"
DESCRIPTION = "The OpenJDK 21 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "21.0.12.1"

RPM_NAME = "java-21-openj9-demo-21.0.12.1-1.1.aarch64.rpm"
RPM_HASH = "2b42741cff760f926cfce1cd2abbb31d1709a862506455faffe99e0af2f9d43ca1f84f5e68bc5d33089aede976e61fbb0a9c8ae4a0913dc41cddc59c4a3a5135"

RPROVIDES:${PN} += "java-21-openj9-demo"

RDEPENDS:${PN} += "java-21-openj9"

inherit rpm
