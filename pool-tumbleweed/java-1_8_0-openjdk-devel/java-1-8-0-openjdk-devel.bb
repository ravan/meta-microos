SUMMARY = "OpenJDK 8 Development Environment"
DESCRIPTION = "The OpenJDK 8 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "1.8.0.504"

RPM_NAME = "java-1_8_0-openjdk-devel-1.8.0.504-1.1.aarch64.rpm"
RPM_HASH = "72f8aa6c4bf7818b204d10a1ec3d44e3b89ba87439031a9e976c87c410970edb7e9cae114c6e63faeb8330d88ce5a333347ab423d20cdf084e3728d3888568a6"

RPROVIDES:${PN} += "java-1-8-0-openjdk-devel \
java-1.8.0-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-1.8.0 \
java-sdk-1.8.0-openjdk \
java-sdk-openjdk \
libjawt.so \
libjli.so \
libunpack.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-1-8-0-openjdk \
ld-linux-aarch64.so.1 \
libawt-xawt.so \
libc.so.6 \
libz.so.1"

inherit rpm
