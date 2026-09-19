SUMMARY = "OpenJDK 21 Development Environment"
DESCRIPTION = "The OpenJDK 21 development tools."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "21.0.12.1"

RPM_NAME = "java-21-openjdk-devel-21.0.12.1-1.1.aarch64.rpm"
RPM_HASH = "3bd902c12b6d76678b1622520197807b0bf375c726657570f13d694d1b55117aaae153d6440c22049b31e79a72f87e9ff82c63d06bee10b6478b6da1e69c8bda"

RPROVIDES:${PN} += "java-21-devel \
java-21-openjdk-devel \
java-devel \
java-devel-openjdk \
java-sdk \
java-sdk-21 \
java-sdk-21-openjdk \
java-sdk-openjdk \
libattach.so \
libsaproc.so"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
java-21-openjdk \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjava.so \
libjli.so \
libstdc++.so.6"

inherit rpm
