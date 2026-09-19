SUMMARY = "Header files for libzopfli, a gzip-compatible compressor"
DESCRIPTION = "The basic function to compress data is ZopfliCompress in zopfli.h. Use the \
ZopfliOptions object to set parameters that affect the speed and compression. \
Use the ZopfliInitOptions function to place the default values in the \
ZopfliOptions first."
LICENSE = "Apache-2.0"

PV = "1.0.3"

RPM_NAME = "libzopfli-devel-1.0.3-2.12.aarch64.rpm"
RPM_HASH = "7e943f81bfcb5404bccaf2ec0f5715b8a8f65a3620b0cf692714a3d003e8f6bba1f5e6195d21e43fd4ef61db36285d23954615a80ed971d7ef8389c80fd54bb9"

RPROVIDES:${PN} += "cmake-Zopfli \
libzopfli-devel"

RDEPENDS:${PN} += "libzopfli1 \
libzopflipng1"

inherit rpm
