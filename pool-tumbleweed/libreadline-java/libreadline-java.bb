SUMMARY = "Java Wrapper for the EditLine Library"
DESCRIPTION = "libreadline-java provides Java bindings for libedit though a JNI \
wrapper."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8.3"

RPM_NAME = "libreadline-java-0.8.3-6.1.aarch64.rpm"
RPM_HASH = "73cf452dbe579d83047fff94f935312aa69e1facc42965e377dd39b0d24e2975bead43d909f6a68ac8ca18c85fc21c67623d47a4961850cb6446f7e3f97b8b09"

RPROVIDES:${PN} += "gnu.readline \
java-readline \
libJavaEditline.so \
libreadline-java"

RDEPENDS:${PN} += "java \
libc.so.6 \
libedit \
libedit.so.0"

inherit rpm
