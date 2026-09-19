SUMMARY = "OpenJDK 26 Runtime Environment"
DESCRIPTION = "The OpenJDK 26 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "26.0.2.0"

RPM_NAME = "java-26-openjdk-26.0.2.0-1.2.aarch64.rpm"
RPM_HASH = "b5bf42d07a2adfc7d549ed796a9acc7e53c4080573374585e0aac1d3b719dcd07d45d4604780959ee6c9cc0eb657cd742d26749195ade084fc468db579bef8c6"

RPROVIDES:${PN} += "java \
java-26 \
java-26-64 \
java-26-openjdk \
java-64 \
java-fonts \
java-openjdk \
java-openjdk-64 \
jre \
jre-26 \
jre-26-64 \
jre-26-openjdk \
jre-26-openjdk-64 \
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
java-26-openjdk-headless \
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
