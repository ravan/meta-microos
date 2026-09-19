SUMMARY = "OpenJDK 17 Demos"
DESCRIPTION = "The OpenJDK 17 demos."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "17.0.20.1"

RPM_NAME = "java-17-openj9-demo-17.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "bff2e995c989435ec3a1f533c17a3361f753968313b2e479729e8f0680b3077337492246cecdd911e387d354d66a004845c00542128cd52d0b9386e2a1d079b1"

RPROVIDES:${PN} += "java-17-openj9-demo"

RDEPENDS:${PN} += "java-17-openj9"

inherit rpm
