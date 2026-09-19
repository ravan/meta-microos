SUMMARY = "Shared library for lerc"
DESCRIPTION = "LERC is an open-source image or raster format which supports rapid encoding \
and decoding for any pixel type (not just RGB or Byte). Users set the \
maximum compression error per pixel while encoding, so the precision of the \
original input image is preserved (within user defined error bounds). \
This package contains shared libraries of lerc"
LICENSE = "Apache-2.0"

PV = "4.1.0"

RPM_NAME = "libLerc4-4.1.0-3.3.aarch64.rpm"
RPM_HASH = "6a7dcb7841f723b5936fa6e519b87401dea81e449c54207ccfd49e0287a7303e908c834c9019d5d1d4881b7cc8903af2f0d6276961145451240fd6383f5780ea"

RPROVIDES:${PN} += "libLerc.so.4 \
libLerc4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
