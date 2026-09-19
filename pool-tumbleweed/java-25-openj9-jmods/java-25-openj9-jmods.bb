SUMMARY = "JMods for OpenJDK 25"
DESCRIPTION = "The JMods for OpenJDK 25."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openj9-jmods-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "f60b6b39e79be61ac8dd1392d760ea2900f42ea7af6b9aab107942af4aeea5de055efde04d626930e9d311170131680370f563e0a8b039976a86a74b656359fd"

RPROVIDES:${PN} += "java-25-openj9-jmods"

RDEPENDS:${PN} += "java-25-openj9-devel"

inherit rpm
