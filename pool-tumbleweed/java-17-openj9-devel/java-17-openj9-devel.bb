SUMMARY = "OpenJDK 17 Development Environment"
DESCRIPTION = "The OpenJDK 17 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "17.0.20.1"

RPM_NAME = "java-17-openj9-devel-17.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "bba6514caeb3bab704850567b783a2b2f299d44d84a823827398f7af27b3415c2aa76f829778ee14eae3b57a303da535aa6ba63f46e046f7737ad4c5d5bed5ac"

RPROVIDES:${PN} += "java-17-devel \
java-17-openj9-devel \
java-devel \
java-devel-openj9 \
java-devel-openjdk \
java-sdk \
java-sdk-17 \
java-sdk-17-openj9 \
java-sdk-17-openjdk \
java-sdk-openj9 \
java-sdk-openjdk \
libattach.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-17-openj9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjava.so \
libjli.so"

inherit rpm
