SUMMARY = "JMods for OpenJDK 17"
DESCRIPTION = "The JMods for OpenJDK 17."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "17.0.20.1"

RPM_NAME = "java-17-openjdk-jmods-17.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "528142cc269e2f87d079d53d8751a32c4e8f1853c6d1f7ffdd58260ee3a5d3669f89d8da981b3fd83d99cc0b6d3467d0cc4b1c867f39aed8844d71035e571eea"

RPROVIDES:${PN} += "java-17-openjdk-jmods"

RDEPENDS:${PN} += "java-17-openjdk-devel"

inherit rpm
