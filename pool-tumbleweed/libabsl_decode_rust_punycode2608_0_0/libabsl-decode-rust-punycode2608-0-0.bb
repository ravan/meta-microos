SUMMARY = "Abseil library liblibabsl_decode_rust_punycode"
DESCRIPTION = "This package contains the libabsl_decode_rust_punycode library for abseil."
LICENSE = "Apache-2.0"

PV = "20260817.0"

RPM_NAME = "libabsl_decode_rust_punycode2608_0_0-20260817.0-1.1.aarch64.rpm"
RPM_HASH = "f5f3ddd6dfc295e447d20348d41edcfddc931050e797104ce3bbce54e359b27fec5b86919f5bd4a985dcd29a563f74fda51177854b61adfc7161f31b331c8552"

RPROVIDES:${PN} += "libabsl-decode-rust-punycode.so.2608.0.0 \
libabsl-decode-rust-punycode2608-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libabsl-utf8-for-code-point.so.2608.0.0 \
libc.so.6"

inherit rpm
