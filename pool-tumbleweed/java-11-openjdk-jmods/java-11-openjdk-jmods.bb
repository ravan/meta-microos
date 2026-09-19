SUMMARY = "JMods for OpenJDK 11"
DESCRIPTION = "The JMods for OpenJDK 11."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "11.0.32.1"

RPM_NAME = "java-11-openjdk-jmods-11.0.32.1-2.1.aarch64.rpm"
RPM_HASH = "b984367eed0650b4d407d8826b8b249a25173ebbd94820127ed1b8dad002f395cb2d02b9d79a2c7963f61daca895230be3e14ce3a15282c29f27064441734853"

RPROVIDES:${PN} += "java-11-openjdk-jmods"

RDEPENDS:${PN} += "java-11-openjdk-devel"

inherit rpm
