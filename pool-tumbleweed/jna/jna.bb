SUMMARY = "Pure Java access to native libraries"
DESCRIPTION = "JNA provides Java programs easy access to native shared libraries \
(DLLs on Windows) without writing anything but Java code. JNA's \
design aims to provide native access in a natural way with a \
minimum of effort. No boilerplate or generated code is required. \
While some attention is paid to performance, correctness and ease \
of use take priority."
LICENSE = "Apache-2.0 | LGPL-2.1-or-later"

PV = "5.13.0"

RPM_NAME = "jna-5.13.0-5.6.aarch64.rpm"
RPM_HASH = "750c85e5c5c91de0c777670e0b19aa23ce83a167f415b657e86e37b721e2ebaa6655abf76146e8974fec9b42bbce7129f61a62e5f6837abe20fdbe36d00703f7"

RPROVIDES:${PN} += "jna \
jna-native \
libjnidispatch \
mvn-net.java.dev.jna-jna \
mvn-net.java.dev.jna-jna-jpms \
mvn-net.java.dev.jna-jna-jpms-pom- \
mvn-net.java.dev.jna-jna-pom- \
osgi-com.sun.jna"

RDEPENDS:${PN} += "java-headless \
javapackages-filesystem \
ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8"

inherit rpm
