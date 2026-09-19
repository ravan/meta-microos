SUMMARY = "The GNU Compiler Collection targeting bpf"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting bpf."
LICENSE = "GPL-3.0-or-later"

PV = "14.4.0+git12698"

RPM_NAME = "cross-bpf-gcc14-14.4.0+git12698-1.3.aarch64.rpm"
RPM_HASH = "ff116692965ee1d7630bede3f560ee04ca9203168cfddfabf6d92c3b35188ddea6cbda6baff9a374f1f5ebca4d2f613d9b00263fb327994fdf288118365bd6dd"

RPROVIDES:${PN} += "bpf-none-gcc \
cross-bpf-gcc14"

RDEPENDS:${PN} += "cross-bpf-binutils \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
