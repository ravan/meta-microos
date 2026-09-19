SUMMARY = "OpenJDK 11 Demos"
DESCRIPTION = "The OpenJDK 11 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "11.0.32.1"

RPM_NAME = "java-11-openjdk-demo-11.0.32.1-2.1.aarch64.rpm"
RPM_HASH = "cee884f258a56138fbe9f484f147e20e58f16f80e6a55048fecb951687056c76ba0888a267302717bf9b5b1d913556baa0f7d1064c2125fbda04cfcd8421fab3"

RPROVIDES:${PN} += "java-11-openjdk-demo"

RDEPENDS:${PN} += "java-11-openjdk"

inherit rpm
