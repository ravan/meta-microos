SUMMARY = "Memory-safe zlib implementation written in Rust"
DESCRIPTION = "zlib-rs is an implementation of the zlib compression algorithms written in \
Rust, exposing the standard zlib C API. \
 \
This package provides the shared library."
LICENSE = "Zlib"

PV = "0.6.7"

RPM_NAME = "libz_rs1-0.6.7-1.2.aarch64.rpm"
RPM_HASH = "5ebc890e388c9e5b3899a6de20b24094602aef01e79d5235e02a6ef8ecd16748837d2ad916366216f6b8dc9977561aa35b23ba281c69249d7d1d4691bcc5bb80"

RPROVIDES:${PN} += "libz-rs.so.1 \
libz-rs1"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1"

inherit rpm
