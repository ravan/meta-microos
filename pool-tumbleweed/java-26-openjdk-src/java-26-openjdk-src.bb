SUMMARY = "OpenJDK 26 Source Bundle"
DESCRIPTION = "The OpenJDK 26 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "26.0.2.0"

RPM_NAME = "java-26-openjdk-src-26.0.2.0-1.2.aarch64.rpm"
RPM_HASH = "df0b35e4886a9a69f82a513e8bd1313936a6a131341531ce4dd5e67882802141f8ceb5e390536f4bc24e5e1e0de8d3ce6e7504621b3f7495de01c6d104c24547"

RPROVIDES:${PN} += "java-26-openjdk-src"

RDEPENDS:${PN} += "java-26-openjdk"

inherit rpm
