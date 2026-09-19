SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "LGPL-3.0-or-later"

PV = "20260703"

RPM_NAME = "libcdirectory1-20260703-1.2.aarch64.rpm"
RPM_HASH = "91701033e980125c1ad00d980a2466bf65ccfd7a0f55d02d76b4f5d195562890cd69adad92f7d88c79e43b8236260930cb92f83ec591965b766cd1cd50c83d3c"

RPROVIDES:${PN} += "libcdirectory.so.1 \
libcdirectory1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libuna.so.1"

inherit rpm
