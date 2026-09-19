SUMMARY = "C++ interface of the Ham Radio Control Libraries"
DESCRIPTION = "Hamlib provides a programming interface for controlling radios and \
other shack hardware. It is a software layer, not a complete user \
application."
LICENSE = "LGPL-2.1-only"

PV = "4.7.2"

RPM_NAME = "libhamlib++4-4.7.2-1.3.aarch64.rpm"
RPM_HASH = "f729b21ff108a7ba81448a1aed46cccad7a98a43b699002383e99eace66e0aeccb19f1319ef6224292c2311a5448d8e7821398ad5913e100c5bc896a26d3915e"

RPROVIDES:${PN} += "libhamlib++.so.4 \
libhamlib++4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhamlib.so.4 \
libstdc++.so.6"

inherit rpm
