SUMMARY = "An IPC library for high performance servers"
DESCRIPTION = "libqb is a library providing high performance client server reusable \
features. It provides logging, tracing, IPC, and polling."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.9+20250916.4b496d0"

RPM_NAME = "libqb100-2.0.9+20250916.4b496d0-1.5.aarch64.rpm"
RPM_HASH = "ab55fcfbdbde614372ce5493d178a5bb3f096266267afbfd652eb0aa87f00468e43134ac2f65170edf46d685a98005c3da0c233ec657894072559742cbc16b3c"

RPROVIDES:${PN} += "libqb.so.100 \
libqb100"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
