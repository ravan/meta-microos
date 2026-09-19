SUMMARY = "OpenJDK 25 Development Environment"
DESCRIPTION = "The OpenJDK 25 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openjdk-devel-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "accd906b61115250adb83eea931d48afd3da27a8ad73620b2c0d7935ee6c9b27d301031fd4009f3d70fac695a4ba7f4cba8afdeb8b83f32e3d891813a7a05c1d"

RPROVIDES:${PN} += "java-25-devel \
java-25-openjdk-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-25 \
java-sdk-25-openjdk \
java-sdk-openjdk \
libattach.so \
libsaproc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-25-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjava.so \
libjli.so \
libm.so.6 \
libstdc++.so.6"

inherit rpm
