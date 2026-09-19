SUMMARY = "Utilities for reading Windows thumbnail cache databases"
DESCRIPTION = "This subpackage contains the utility programs from libwtcdb to \
read Windows thumbnail cache databases."
LICENSE = "LGPL-3.0-or-later"

PV = "20260527"

RPM_NAME = "libwtcdb-tools-20260527-1.10.aarch64.rpm"
RPM_HASH = "40ba39ca5c76061935d5226915e6c87e3d867b81d1ec0fa8a3b23d4e0017a9842593126db9313b7d98a605e53cfa14a97282f10c2ea6549860327360c2b9defa"

RPROVIDES:${PN} += "libwtcdb-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcpath.so.1 \
libwtcdb.so.1"

inherit rpm
