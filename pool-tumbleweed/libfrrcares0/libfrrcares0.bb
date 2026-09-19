SUMMARY = "FRRouting utility library"
DESCRIPTION = "This library contains various utility functions to FRRouting, such as \
data types, buffers and socket handling."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.6.1"

RPM_NAME = "libfrrcares0-10.6.1-1.3.aarch64.rpm"
RPM_HASH = "60d029dd4ea6556ba5a0f1406be73b3fef9be942b5cc7bea45590432970dc4e974276e9d23b9a6f71828a5dd2a510f2e4f43cd97fc1387d0f2f8e77ae4f408b3"

RPROVIDES:${PN} += "libfrrcares.so.0 \
libfrrcares0"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libcares.so.2"

inherit rpm
