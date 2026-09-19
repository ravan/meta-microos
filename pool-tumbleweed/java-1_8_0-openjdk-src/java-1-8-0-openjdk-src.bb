SUMMARY = "OpenJDK 8 Source Bundle"
DESCRIPTION = "The OpenJDK 8 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "1.8.0.504"

RPM_NAME = "java-1_8_0-openjdk-src-1.8.0.504-1.1.aarch64.rpm"
RPM_HASH = "9b9d8b47146e8468a54d04699de81dcdb762e826f539d3c1df4ceb76394f2a5be43ccd12f28049c38ced13bcc55e451b8ed79a11863d009be19b3be772cfe0cf"

RPROVIDES:${PN} += "java-1-8-0-openjdk-src"

RDEPENDS:${PN} += "java-1-8-0-openjdk"

inherit rpm
