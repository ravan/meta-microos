SUMMARY = "Library to access the QEMU Copy-On-Write (QCOW) image format"
DESCRIPTION = "Library to access the QEMU Copy-On-Write (QCOW) image format. \
QCOW formats v1 and v2 in compressed or encrypted form are supported. \
Not supported are backing file-based snapshots and in-image snapshots."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libqcow1-20260703-1.4.aarch64.rpm"
RPM_HASH = "001fe5a6d233f643d21b9c96cadc813b2b4ddc3999d5432bb06c3ef6bf4c87e426c287db72f34682f5b23966ebd2d72e04da3db176436bfc627c7757a03d0c9d"

RPROVIDES:${PN} += "libqcow.so.1 \
libqcow1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcaes.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libuna.so.1 \
libz.so.1"

inherit rpm
