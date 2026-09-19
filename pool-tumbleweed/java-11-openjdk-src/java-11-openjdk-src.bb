SUMMARY = "OpenJDK 11 Source Bundle"
DESCRIPTION = "The OpenJDK 11 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "11.0.32.1"

RPM_NAME = "java-11-openjdk-src-11.0.32.1-2.1.aarch64.rpm"
RPM_HASH = "c1a388f9107b4f7e19f260bb9969aed6883eae55c21a815fe919894b7221347951603bd00432f1aa70eb00222b7538d20c23d3e5c034e3424c3bb4db4bfee133"

RPROVIDES:${PN} += "java-11-openjdk-src"

RDEPENDS:${PN} += "java-11-openjdk"

inherit rpm
