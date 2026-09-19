SUMMARY = "OpenJDK 25 Runtime Environment with Eclipse OpenJ9 virtual machine"
DESCRIPTION = "The OpenJDK 25 with Eclipse OpenJ9 virtual machine. Eclipse OpenJ9 \
is a Java Virtual Machine for OpenJDK that is optimized for small \
footprint, fast start-up, and high throughput. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "25.0.4.1"

RPM_NAME = "java-25-openj9-25.0.4.1-1.1.aarch64.rpm"
RPM_HASH = "dec4fadca6845cf6b3e0e2c941d77edc6d3f4e176f0ca3c00b2e2f4da00e10028ba0021df02251ef123df0e8ca88117449b929537c874efa8c9e5c7cda32c5d0"

RPROVIDES:${PN} += "java \
java-25 \
java-25-64 \
java-25-openj9 \
java-64 \
java-fonts \
java-openj9 \
java-openj9-64 \
java-openjdk \
java-openjdk-64 \
jre \
jre-25 \
jre-25-64 \
jre-25-openj9 \
jre-25-openj9-64 \
jre-25-openjdk \
jre-25-openjdk-64 \
jre-64 \
jre-openj9 \
jre-openj9-64 \
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
java-25-openj9-headless \
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
libz.so.1 \
mozilla-nss"

inherit rpm
