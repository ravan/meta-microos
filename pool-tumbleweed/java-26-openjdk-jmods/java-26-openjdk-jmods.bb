SUMMARY = "JMods for OpenJDK 26"
DESCRIPTION = "The JMods for OpenJDK 26."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "26.0.2.0"

RPM_NAME = "java-26-openjdk-jmods-26.0.2.0-1.2.aarch64.rpm"
RPM_HASH = "d453c4e6eb8e5af589bff494ffd4b791a2d81ad6cce26f9d6dc273fa4aca726a096750c1d6a674d65fce16b0142b8e30d2745aa0d08dfd08469c0e51e6c18af0"

RPROVIDES:${PN} += "java-26-openjdk-jmods"

RDEPENDS:${PN} += "java-26-openjdk-devel"

inherit rpm
