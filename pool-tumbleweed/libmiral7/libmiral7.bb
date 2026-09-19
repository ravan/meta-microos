SUMMARY = "Mir Abstraction Layer library"
DESCRIPTION = "Component library of the Mir compositing stack"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "libmiral7-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "0803185da80310e48100c08787352ef1dbb5d2362e89a1ff6f4172cde007beab96e2a2f2c0c6537d202ed7af74acdc78871c34a730cb361654ab903e9450b41f"

RPROVIDES:${PN} += "libmiral.so.7 \
libmiral7"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libmircommon.so.12 \
libmircore.so.2 \
libmirplatform.so.34 \
libmirserver.so.67 \
libstdc++.so.6 \
libwayland-client.so.0 \
libwayland-server.so.0 \
libyaml-cpp.so.0.9"

inherit rpm
