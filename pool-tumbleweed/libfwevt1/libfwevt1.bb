SUMMARY = "Library for Windows XML Event Log data types"
DESCRIPTION = "libfwevt is a library for Windows XML Event Log (EVTX) data types. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20260702"

RPM_NAME = "libfwevt1-20260702-1.3.aarch64.rpm"
RPM_HASH = "b54dd2dcde74ad3b085a181769ac46814bdde3718f6c6ee303e10857096ee9d89a738393e9966b73363999929e5082a732b1b0bd66245726487b13927a97ac9e"

RPROVIDES:${PN} += "libfwevt.so.1 \
libfwevt1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
