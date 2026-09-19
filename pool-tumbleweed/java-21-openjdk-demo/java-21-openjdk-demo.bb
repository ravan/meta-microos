SUMMARY = "OpenJDK 21 Demos"
DESCRIPTION = "The OpenJDK 21 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "21.0.12.1"

RPM_NAME = "java-21-openjdk-demo-21.0.12.1-1.1.aarch64.rpm"
RPM_HASH = "93ba81aeb9f7c9f698333224551e68bee7dff4d839ea4c8d476de7249fdcee130359403ef9a6c728b78f5c18aed7d739b5a89b53a42296d7a9e5a2fc30703d65"

RPROVIDES:${PN} += "java-21-openjdk-demo"

RDEPENDS:${PN} += "java-21-openjdk"

inherit rpm
