SUMMARY = "Development files for zlib, a data compression library"
DESCRIPTION = "zlib is a general-purpose lossless data-compression library, \
implementing an API for the DEFLATE algorithm, the latter of \
which is being used by, for example, gzip and the ZIP archive \
format. \
 \
This subpackage holds the development headers for the library. \
 \
The zlib data format is itself portable across platforms. Unlike the \
LZW compression method used in unix compress(1) and in the GIF image \
format, the compression method currently used in zlib essentially \
never expands the data. (LZW can double or triple the file size in \
extreme cases.) zlib's memory footprint is also independent of the \
input data and can be reduced, if necessary, at some cost in \
compression."
LICENSE = "Zlib"

PV = "1.3.1"

RPM_NAME = "zlib-devel-1.3.1-3.3.aarch64.rpm"
RPM_HASH = "c4008e3f3698e004953fdb07837423098044e86d4f757549be5e47e10a9ff1cbc1af896d386b764d788ae0d4a955aaf884171173d2d81c5ead10bf617e25d183"

RPROVIDES:${PN} += "pkgconfig-zlib \
zlib-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libz1"

inherit rpm
