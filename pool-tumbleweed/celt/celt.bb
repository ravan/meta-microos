SUMMARY = "Ultra-Low Delay Audio Codec"
DESCRIPTION = "The CELT codec is an experimental audio codec for use in low-delay \
speech and audio communication."
LICENSE = "BSD-2-Clause"

PV = "0.11.3"

RPM_NAME = "celt-0.11.3-2.5.aarch64.rpm"
RPM_HASH = "02d4b1db5f87a44934488020b24616efa6921769c662467b41608d64471f510b3b2e4736ef631844d3d4624f6a662043304dcffd6d61c6b550dd01f04d207f77"

RPROVIDES:${PN} += "celt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcelt0-2 \
libcelt0.so.2 \
libogg.so.0"

inherit rpm
