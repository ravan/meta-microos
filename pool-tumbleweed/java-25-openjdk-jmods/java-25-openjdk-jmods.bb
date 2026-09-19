SUMMARY = "JMods for OpenJDK 25"
DESCRIPTION = "The JMods for OpenJDK 25."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openjdk-jmods-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "bbcefd78d49e5382c6e85e2b1207a847baea2adbc87487d342024be8af392c49039926f85c32732f3462c17f9b072b877b53ab5e7d45d137b3d5e9274333bb2f"

RPROVIDES:${PN} += "java-25-openjdk-jmods"

RDEPENDS:${PN} += "java-25-openjdk-devel"

inherit rpm
