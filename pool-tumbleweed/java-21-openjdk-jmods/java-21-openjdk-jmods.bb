SUMMARY = "JMods for OpenJDK 21"
DESCRIPTION = "The JMods for OpenJDK 21."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "21.0.12.1"

RPM_NAME = "java-21-openjdk-jmods-21.0.12.1-1.1.aarch64.rpm"
RPM_HASH = "9a6a68479848b688f6b9ad82e1f1e61cd424b322f960fc1ec215ce0e4101b25a49035b27df290c4809e2aeeb83e9a6289155340557d255b638964898d6ed8b74"

RPROVIDES:${PN} += "java-21-openjdk-jmods"

RDEPENDS:${PN} += "java-21-openjdk-devel"

inherit rpm
