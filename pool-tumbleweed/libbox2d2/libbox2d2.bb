SUMMARY = "A 2D Physics Engine for Games"
DESCRIPTION = "Box2D is an open source C++ engine for simulating rigid bodies in 2D."
LICENSE = "MIT"

PV = "2.4.1"

RPM_NAME = "libbox2d2-2.4.1-3.6.aarch64.rpm"
RPM_HASH = "68fb28beaf28dc49d14018f280498ecc7d2c5d9b53fade49a9a3defb389e6953ebbffba92d8448fff8b831481b2bbf9a5275536ac305ee87d9cc8e5baeda26a7"

RPROVIDES:${PN} += "libbox2d.so.2 \
libbox2d2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
