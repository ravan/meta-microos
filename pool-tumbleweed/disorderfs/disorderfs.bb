SUMMARY = "FUSE filesystem that introduces non-determinism"
DESCRIPTION = "disorderfs is an overlay FUSE filesystem that introduces non-determinism into \
filesystem metadata. For example, it can randomize the order in which \
directory entries are read. This is useful for detecting non-determinism \
in the build process."
LICENSE = "GPL-3.0-or-later"

PV = "0.7.0"

RPM_NAME = "disorderfs-0.7.0-1.1.aarch64.rpm"
RPM_HASH = "d8927667d4746b50749f88e23427d5b13b1014f74102bb897efed18ec28c46535ac9e6ff052a41a5697c7d7a1ba5e8bbf95aedbd36efc6dbd532478de00bc222"

RPROVIDES:${PN} += "disorderfs"

RDEPENDS:${PN} += "fuse3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfuse3.so.4 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
