SUMMARY = "OpenJDK 26 Development Environment"
DESCRIPTION = "The OpenJDK 26 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "26.0.2.0"

RPM_NAME = "java-26-openjdk-devel-26.0.2.0-1.2.aarch64.rpm"
RPM_HASH = "e7c8451c28656b67734003bd4114bfc21ecf6806a395a4759c15c670ecb7d1db6d2d0d7769ec473580f3e3d01630c618d302d55b8a3b5ddacd03d0288cf387c4"

RPROVIDES:${PN} += "java-26-devel \
java-26-openjdk-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-26 \
java-sdk-26-openjdk \
java-sdk-openjdk \
libattach.so \
libsaproc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-26-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjava.so \
libjli.so \
libm.so.6 \
libstdc++.so.6"

inherit rpm
