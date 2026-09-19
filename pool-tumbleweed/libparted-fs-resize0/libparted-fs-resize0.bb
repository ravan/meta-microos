SUMMARY = "Library for manipulating partitions"
DESCRIPTION = "Libparted is a library for creating, destroying, resizing, checking \
and copying partitions and the file systems on them."
LICENSE = "GPL-3.0-or-later"

PV = "3.7"

RPM_NAME = "libparted-fs-resize0-3.7-1.3.aarch64.rpm"
RPM_HASH = "a9540120e837480ee7cbd889d06d6f563bd52ded6881b877258263caeef808d1c3177be394c8c79409db5f2f8a4e345920adeeb34f207ecb22d8e8161c3b843e"

RPROVIDES:${PN} += "libparted-fs-resize.so.0 \
libparted-fs-resize0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
