SUMMARY = "OpenJDK 21 Source Bundle"
DESCRIPTION = "The OpenJDK 21 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "21.0.12.1"

RPM_NAME = "java-21-openjdk-src-21.0.12.1-1.1.aarch64.rpm"
RPM_HASH = "a55c513b8688b69efb705d0f7280f29109ef004af1995e900a7368b15daedfa9b29b26342043b70f4bfbc73e1ef9be1c831e744f49cd648a07f0fc1edf9cb905"

RPROVIDES:${PN} += "java-21-openjdk-src"

RDEPENDS:${PN} += "java-21-openjdk"

inherit rpm
