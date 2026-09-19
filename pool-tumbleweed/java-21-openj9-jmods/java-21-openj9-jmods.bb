SUMMARY = "JMods for OpenJDK 21"
DESCRIPTION = "The JMods for OpenJDK 21."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "21.0.12.1"

RPM_NAME = "java-21-openj9-jmods-21.0.12.1-1.1.aarch64.rpm"
RPM_HASH = "9386bb07ab6702347acbe97dff2b2ecdfafc6036c7f82996c40e627307078fc34049416e2986d498df0e55eeaaa778e2d35b77c4fa63a7fc2951a0c679c2b237"

RPROVIDES:${PN} += "java-21-openj9-jmods"

RDEPENDS:${PN} += "java-21-openj9-devel"

inherit rpm
