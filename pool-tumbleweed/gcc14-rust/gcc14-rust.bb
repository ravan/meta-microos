SUMMARY = "GNU Rust Compiler"
DESCRIPTION = "This package contains a Rust compiler."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "gcc14-rust-14.4.0+git12698-1.4.aarch64.rpm"
RPM_HASH = "520ede2a697e280f71cfcff589574be02062538d7f24902603dc51a8740a25d8007168c9aedbaece580b39f9583410c35f075401442d46e2ba564da143362a8d"

RPROVIDES:${PN} += "gcc14-rust"

RDEPENDS:${PN} += "gcc14 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
