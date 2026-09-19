SUMMARY = "OpenJDK 25 Source Bundle"
DESCRIPTION = "The OpenJDK 25 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openjdk-src-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "c7df9b8cc1e355ef1e5d2b2a3631e4dcbe64ebb0604c70eefde9f257861d681cd2670c2bc5cdad0321564f4ad030bf18c569c22986f7042ff772c4a4ad8bfd1f"

RPROVIDES:${PN} += "java-25-openjdk-src"

RDEPENDS:${PN} += "java-25-openjdk"

inherit rpm
