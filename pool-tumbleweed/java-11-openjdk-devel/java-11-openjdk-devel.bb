SUMMARY = "OpenJDK 11 Development Environment"
DESCRIPTION = "The OpenJDK 11 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "11.0.32.1"

RPM_NAME = "java-11-openjdk-devel-11.0.32.1-2.1.aarch64.rpm"
RPM_HASH = "f91959360c5213b1a9df41d7641c1c67aaccde9e47d891b8d668a08d9490a9b7df04ff5b6913eade3cbd986b911fb76bb73447f03fa0fb9895606294c73a3f89"

RPROVIDES:${PN} += "java-11-devel \
java-11-openjdk-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-11 \
java-sdk-11-openjdk \
java-sdk-openjdk \
libattach.so \
libsaproc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-11-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libjava.so \
libjli.so"

inherit rpm
