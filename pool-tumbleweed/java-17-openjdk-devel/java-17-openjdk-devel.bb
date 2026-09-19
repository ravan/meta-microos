SUMMARY = "OpenJDK 17 Development Environment"
DESCRIPTION = "The OpenJDK 17 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "17.0.20.1"

RPM_NAME = "java-17-openjdk-devel-17.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "68fc82d96b09052af5b3046c2aabb12c5f2e37b9573b5ec12d694553b3964bd26d576b9135800c4b1e01cb31b3ad5c68451ec275211f5b88187a9cafecb00c1e"

RPROVIDES:${PN} += "java-17-devel \
java-17-openjdk-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-17 \
java-sdk-17-openjdk \
java-sdk-openjdk \
libattach.so \
libsaproc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-17-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjava.so \
libjli.so \
libstdc++.so.6"

inherit rpm
