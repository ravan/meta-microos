SUMMARY = "Tools to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Tools to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libqcow-tools-20260703-1.4.aarch64.rpm"
RPM_HASH = "65c4809efa706c4215c71301f0c3f8de9a462bc4a7eca1d4481c61c6585ac9f88aff552ea68304a479a6293e61a0ba75e284d5401b3e460019d15e07632de9b9"

RPROVIDES:${PN} += "libqcow-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libfuse3.so.4 \
libqcow.so.1 \
libuna.so.1"

inherit rpm
