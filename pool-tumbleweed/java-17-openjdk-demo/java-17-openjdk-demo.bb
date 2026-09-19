SUMMARY = "OpenJDK 17 Demos"
DESCRIPTION = "The OpenJDK 17 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "17.0.20.1"

RPM_NAME = "java-17-openjdk-demo-17.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "6f05e404cd4cc3156db6f8ec63b442bfc440b037c2067af23bb743bbdad8a35853efb0793031818353e8f129470acf07d7e8217dd504c853e65b6dcf25ba3d1b"

RPROVIDES:${PN} += "java-17-openjdk-demo"

RDEPENDS:${PN} += "java-17-openjdk"

inherit rpm
