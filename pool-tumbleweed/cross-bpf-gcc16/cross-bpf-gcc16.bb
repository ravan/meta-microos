SUMMARY = "The GNU Compiler Collection targeting bpf"
DESCRIPTION = "The GNU Compiler Collection as a cross-compiler targeting bpf."
LICENSE = "GPL-3.0-or-later"

PV = "16.2.0+git9497"

RPM_NAME = "cross-bpf-gcc16-16.2.0+git9497-3.1.aarch64.rpm"
RPM_HASH = "b2259ef9c3226d164d62e744e779857428875b296c5a5fdb6aac5ca636ab9517da35d4fa320fc51e9822315bb500dac6faaaedc4886dd81d1795e1317802cd75"

RPROVIDES:${PN} += "bpf-none-gcc \
cross-bpf-gcc16"

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
