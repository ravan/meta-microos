SUMMARY = "UTF-8 validation libraries from Protobuf"
DESCRIPTION = "UTF-8 string validation library with optional SIMD acceleration (armv8a NEON, \
SSE4 and AVX2)."
LICENSE = "BSD-3-Clause"

PV = "36.1"

RPM_NAME = "libutf8_range-36_1_0-36.1-1.1.aarch64.rpm"
RPM_HASH = "04f4cd6ec584a81cddb8a85d0a7e8b6252dc28d673ded4d4d4b904b703b20c226c12db7a188908221f9cd4da59dcc9c4077c73a706aa08e16d5ac5eba00ac0ff"

RPROVIDES:${PN} += "libutf8-range-36-1-0 \
libutf8-range.so.36.1.0 \
libutf8-validity.so.36.1.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
