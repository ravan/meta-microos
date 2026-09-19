SUMMARY = "OpenJDK 25 Source Bundle"
DESCRIPTION = "The OpenJDK 25 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openj9-src-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "629070683807e96a12eb0a36a428cd7ef8b13b6ab5cc9a372e6b00835da1a4866ab415662c1d8bec5b5d96e1d3746918c69a7a7b4522a3fa250af4ab20028705"

RPROVIDES:${PN} += "java-25-openj9-src"

RDEPENDS:${PN} += "java-25-openj9"

inherit rpm
