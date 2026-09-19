SUMMARY = "An AV1 decoder"
DESCRIPTION = "dav1d is a SIMD-enhanced decoder for AV1 video. It features \
 \
 * Accelerated assembly using x86 AVX2. \
 * Partial acceleration using x86 SSSE3 and ARM NEON. \
 * Support for bitdepths 8, 10 and 12. \
 * Support for chroma subsamplings 4:2:0, 4:2:2, 4:4:4 and grayscale. \
 \
AV1 is a royalty-free video codec by the Alliance for Open Media. It \
has the potential to be up to 20% better than the HEVC codec. \
dav1d outperforms gav1 by about 20% on ARM and 50% on x86, \
and has better scaling properties for larger thread counts."
LICENSE = "BSD-2-Clause"

PV = "1.5.4"

RPM_NAME = "dav1d-1.5.4-1.2.aarch64.rpm"
RPM_HASH = "e46409e311a345806e5587b1b7cfe91b7e08e7035efb542987ef0adea0103e37844e4a8c146371b8ef320ac0ac862f0b78e7eed67eb22d02790854e25bd639c1"

RPROVIDES:${PN} += "dav1d"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libdav1d.so.7 \
libm.so.6"

inherit rpm
