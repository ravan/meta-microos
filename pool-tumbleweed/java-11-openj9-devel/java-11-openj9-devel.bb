SUMMARY = "OpenJDK 11 Development Environment"
DESCRIPTION = "The OpenJDK 11 development tools. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "11.0.32.1"

RPM_NAME = "java-11-openj9-devel-11.0.32.1-1.1.aarch64.rpm"
RPM_HASH = "b3d0751be444f31677d75ef35006cb65e5cef8b547c585206df93477286a63d27042c9355164f26271fa0f8ed037b447cb3ce2854c741c53b126b8ad558f9e1b"

RPROVIDES:${PN} += "java-11-devel \
java-11-openj9-devel \
java-devel \
java-devel-openj9 \
java-devel-openjdk \
java-sdk \
java-sdk-11 \
java-sdk-11-openj9 \
java-sdk-11-openjdk \
java-sdk-openj9 \
java-sdk-openjdk \
libattach.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-11-openj9 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjava.so \
libjli.so"

inherit rpm
