SUMMARY = "OpenJDK 8 Development Environment with Eclipse OpenJ9"
DESCRIPTION = "The OpenJDK 8 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "1.8.0.504"

RPM_NAME = "java-1_8_0-openj9-devel-1.8.0.504-1.1.aarch64.rpm"
RPM_HASH = "775e73907605c2a0374bcc87e6491c55d9b2d8bdbd60a6a86c8ae3f78598ec16d7ac2cddd07b126d4640112cb1ffc00598e4e3ef0bc7097dab41e3c1a3ee0983"

RPROVIDES:${PN} += "java-1-8-0-openj9-devel \
java-1.8.0-devel \
java-devel \
java-devel-openj9 \
java-devel-openjdk \
java-sdk \
java-sdk-1.8.0 \
java-sdk-1.8.0-openj9 \
java-sdk-1.8.0-openjdk \
java-sdk-openj9 \
java-sdk-openjdk \
libjawt.so \
libjli.so \
libunpack.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-1-8-0-openj9 \
ld-linux-aarch64.so.1 \
libawt-xawt.so \
libc.so.6 \
libz.so.1"

inherit rpm
