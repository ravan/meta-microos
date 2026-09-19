SUMMARY = "LZMA Compression and Decompression Library"
DESCRIPTION = "The lzlib compression library provides in-memory LZMA compression and \
decompression functions, including integrity checking of the \
decompressed data. The compressed data format used by the library is \
the lzip format. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libcerror."
LICENSE = "BSD-2-Clause & GPL-2.0-or-later"

PV = "1.16"

RPM_NAME = "lzlib-devel-1.16-1.3.aarch64.rpm"
RPM_HASH = "40c76c9d517da55dbbc91ac3dec756ebef7444c566dc0f971c63a6242bbf50f9c6bc7b171f51c742f831d651894c02f39846f4132f2fc8a4d81167268b30621f"

RPROVIDES:${PN} += "lzlib-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
liblz1"

inherit rpm
