SUMMARY = "Library for parsing CSS using the Rust cssparser crate"
DESCRIPTION = "A C++ library for parsing CSS that uses the Rust cssparser crate internally."
LICENSE = "LGPL-2.1-or-later"

PV = "1.0.0"

RPM_NAME = "libcxx-rust-cssparser1-1.0.0-1.4.aarch64.rpm"
RPM_HASH = "13db059c1cbe0fc64509332e3eb9c0a3baeccf5057e8fd9500c05efe5207542f4ddcd4f3a63e7a97a8df78962bd37cb423c1ac1ab6fb56a7216e28939ef447f7"

RPROVIDES:${PN} += "libcxx-rust-cssparser.so.1 \
libcxx-rust-cssparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
