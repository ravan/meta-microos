SUMMARY = "Storage array management library"
DESCRIPTION = "The libStorageMgmt library will provide a vendor agnostic open source storage \
application programming interface (API) that will allow management of storage \
arrays.  The library includes a command line interface for interactive use and \
scripting (command lsmcli).  The library also has a daemon that is used for \
executing plug-ins in a separate process (lsmd)."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.10.3"

RPM_NAME = "libstoragemgmt1-1.10.3-1.3.aarch64.rpm"
RPM_HASH = "b7711cbf55c8ca5ecfad63bc022fcfb4bd27f3926df6394efb82333d639d943e074cb951c6a5e90e2f5ea4ad9acf982bdd1b5737cd8329e04e4ecd0a3b1081a8"

RPROVIDES:${PN} += "libstoragemgmt.so.1 \
libstoragemgmt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libglib-2.0.so.0 \
libled.so.1 \
libstdc++.so.6 \
libudev.so.1"

inherit rpm
