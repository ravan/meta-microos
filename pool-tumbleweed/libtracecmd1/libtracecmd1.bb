SUMMARY = "Library for creating and reading trace-cmd data files"
DESCRIPTION = "Library for creating and reading trace-cmd data files"
LICENSE = "LGPL-2.1-only"

PV = "1.5.5"

RPM_NAME = "libtracecmd1-1.5.5-1.2.aarch64.rpm"
RPM_HASH = "c6749cf2d5d81f87def0f48774cc32172dd6cfb77197af4ad49016465686eaab8a1d27e817eb42427da58e22e82f5fab4304e10ac742ab550f05939d0f0609f5"

RPROVIDES:${PN} += "libtracecmd.so.1 \
libtracecmd1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtraceevent.so.1 \
libtracefs.so.1 \
libzstd.so.1"

inherit rpm
