SUMMARY = "JMods for OpenJDK 17"
DESCRIPTION = "The JMods for OpenJDK 17."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "17.0.20.1"

RPM_NAME = "java-17-openj9-jmods-17.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "d2d9a63028d5ec351636573c8db718071b7c71f53051c583ff32a6445bf6e1b67aeb2d47c716ccbceb482add40a4120aabf4a90c26ab7eb60745cb38857bba62"

RPROVIDES:${PN} += "java-17-openj9-jmods"

RDEPENDS:${PN} += "java-17-openj9-devel"

inherit rpm
