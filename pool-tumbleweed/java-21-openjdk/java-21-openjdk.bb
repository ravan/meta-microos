SUMMARY = "OpenJDK 21 Runtime Environment"
DESCRIPTION = "The OpenJDK 21 runtime environment."
LICENSE = "Apache-1.1 & Apache-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "21.0.12.1"

RPM_NAME = "java-21-openjdk-21.0.12.1-1.1.aarch64.rpm"
RPM_HASH = "557c164ce03ebcd9e78435c7e91d8ab4436a4eabc28076ff49bc8a12c992bc294e9d0c30682f6bb8c49e56fc4526bbe66b937487787d0a8de0085f206a66df80"

RPROVIDES:${PN} += "java \
java-21 \
java-21-64 \
java-21-openjdk \
java-64 \
java-fonts \
java-openjdk \
java-openjdk-64 \
jre \
jre-21 \
jre-21-64 \
jre-21-openjdk \
jre-21-openjdk-64 \
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
java-21-openjdk-headless \
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
libpng16.so.16"

inherit rpm
