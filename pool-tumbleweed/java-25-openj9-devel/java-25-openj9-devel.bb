SUMMARY = "OpenJDK 25 Development Environment"
DESCRIPTION = "The OpenJDK 25 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openj9-devel-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "7b0b8624a6150b423c1958f7c591fb4201d1b21d4d71b86c5b956a11bb0022e7e71d0a6b11b7a55d553e87092c7a445c159c7be463d00867d7b8d25623821346"

RPROVIDES:${PN} += "java-25-devel \
java-25-openj9-devel \
java-devel \
java-devel-openj9 \
java-devel-openjdk \
java-sdk \
java-sdk-25 \
java-sdk-25-openj9 \
java-sdk-25-openjdk \
java-sdk-openj9 \
java-sdk-openjdk \
libattach.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-25-openj9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjava.so \
libjli.so \
libz.so.1"

inherit rpm
