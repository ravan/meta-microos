SUMMARY = "OpenJDK 25 Runtime Environment"
DESCRIPTION = "The OpenJDK 25 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openjdk-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "ffce420cdd949ea4987262be08df57e911e87f46cc46858718e204f6b52c15473d64b88c8b145af5fee718a8c0abe4aeb462c37b8623dd8bb1ab07d72379d1e9"

RPROVIDES:${PN} += "java \
java-25 \
java-25-64 \
java-25-openjdk \
java-64 \
java-fonts \
java-openjdk \
java-openjdk-64 \
jre \
jre-25 \
jre-25-64 \
jre-25-openjdk \
jre-25-openjdk-64 \
jre-64 \
jre-openjdk \
jre-openjdk-64 \
jre1.10.x \
jre1.3.x \
jre1.4.x \
jre1.5.x \
jre1.6.x \
jre1.7.x \
jre1.8.x \
jre1.9.x \
libawt-xawt.so \
libjawt.so \
libsplashscreen.so"

RDEPENDS:${PN} += "file \
fontconfig \
java-25-openjdk-headless \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXi.so.6 \
libXrender.so.1 \
libXtst.so.6 \
libawt.so \
libc.so.6 \
libgif.so.7 \
libjava.so \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libz.so.1"

inherit rpm
