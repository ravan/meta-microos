SUMMARY = "The kim-api library"
DESCRIPTION = "OpenKIM is an online framework for making molecular simulations reliable, \
reproducible, and portable.  Models conforming to the KIM application \
programming interface work seamlessly with major simulation codes that have \
adopted the KIM-API standard. \
 \
This package contains the kim-api library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.0"

RPM_NAME = "libkim-api2-2.3.0-2.9.aarch64.rpm"
RPM_HASH = "76e73a3ca66d6733a14541464291300d5751b4c9fd73d94fd283023807ee4937ecacf68b0ac7fe43b451d85b6e653d2df4aad018d95168b68df900fe4e1ec6ae"

RPROVIDES:${PN} += "libkim-api.so.2 \
libkim-api2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgfortran.so.5 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
