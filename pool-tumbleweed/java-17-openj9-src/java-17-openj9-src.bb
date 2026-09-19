SUMMARY = "OpenJDK 17 Source Bundle"
DESCRIPTION = "The OpenJDK 17 source bundle."
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "17.0.20.1"

RPM_NAME = "java-17-openj9-src-17.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "85f10dda725645be9421c246ec2002bf7cf4bcca591f5210456bea1d2ed9913623358a18ab8e9801bb976377f8a42a0945169375584b3d28aaa7d17b1aa5c2c0"

RPROVIDES:${PN} += "java-17-openj9-src"

RDEPENDS:${PN} += "java-17-openj9"

inherit rpm
