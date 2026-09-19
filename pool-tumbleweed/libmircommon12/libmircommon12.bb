SUMMARY = "Mir server library"
DESCRIPTION = "Component library of the Mir compositing stack"
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "2.28.0"

RPM_NAME = "libmircommon12-2.28.0-1.3.aarch64.rpm"
RPM_HASH = "d56440dcdf7f8da24562e700cb3ea5c7fd4d95590f63e3aad53f5be1dafacb1e2b78f07e87e46fd9a5003a0304c0679fc06c9611d4ebe0b8ea7b500f95aee66f"

RPROVIDES:${PN} += "libmircommon.so.12 \
libmircommon12"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libmircore.so.2 \
libstdc++.so.6 \
libxkbcommon.so.0"

inherit rpm
