SUMMARY = "OpenJDK 21 Development Environment"
DESCRIPTION = "The OpenJDK 21 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "21.0.12.1"

RPM_NAME = "java-21-openj9-devel-21.0.12.1-1.1.aarch64.rpm"
RPM_HASH = "a96f2aabfcc303ce100beec3e827916fb5846186762836e2e528692904e436d533a866fa351fd2514563604c8725b1a895db108dcd06eeb853b56a6c7e3e912c"

RPROVIDES:${PN} += "java-21-devel \
java-21-openj9-devel \
java-devel \
java-devel-openj9 \
java-devel-openjdk \
java-sdk \
java-sdk-21 \
java-sdk-21-openj9 \
java-sdk-21-openjdk \
java-sdk-openj9 \
java-sdk-openjdk \
libattach.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-21-openj9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjava.so \
libjli.so"

inherit rpm
