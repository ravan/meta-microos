SUMMARY = "OpenJDK 17 Runtime Environment with Eclipse OpenJ9 virtual machine"
DESCRIPTION = "The OpenJDK 17 with Eclipse OpenJ9 virtual machine. Eclipse OpenJ9 \
is a Java Virtual Machine for OpenJDK that is optimized for small \
footprint, fast start-up, and high throughput. \
 \
Supported architectures are ppc64le, s390x and x86_64"
LICENSE = "Apache-1.1 & Apache-2.0 & EPL-2.0 & GPL-1.0-or-later & GPL-2.0-only & GPL-2.0-only-with-Classpath-exception-2.0 & LGPL-2.0-only & MPL-1.0 & MPL-1.1 & LicenseRef-SUSE-Public-Domain & W3C"

PV = "17.0.20.1"

RPM_NAME = "java-17-openj9-17.0.20.1-1.1.aarch64.rpm"
RPM_HASH = "55430c620137615cf2b7a00c40cd80549167f4d185169207a9b2fb3dc8d69fcf94c731b5786da3e00f9a6217c2a9a1fbca0cc990dc83b446a372eba5a05d6bfa"

RPROVIDES:${PN} += "java \
java-17 \
java-17-64 \
java-17-openj9 \
java-64 \
java-fonts \
java-openj9 \
java-openj9-64 \
java-openjdk \
java-openjdk-64 \
jre \
jre-17 \
jre-17-64 \
jre-17-openj9 \
jre-17-openj9-64 \
jre-17-openjdk \
jre-17-openjdk-64 \
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
java-17-openj9-headless \
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
mozilla-nss"

inherit rpm
