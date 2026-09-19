SUMMARY = "Image reading library"
DESCRIPTION = "Mahotas-imread is a simple module with a small number of functions: \
 \
imread \
    Reads an image file \
imread_multi \
    Reads an image file with multiple images. Currently, TIFF and STK (a TIFF \
    sub-based format) support this function. \
imsave \
    Writes an image file"
LICENSE = "MIT"

PV = "0.7.6"

RPM_NAME = "python314-imread-0.7.6-1.9.aarch64.rpm"
RPM_HASH = "e090cc01623be1d05d617f9bc1ea86dd7c826e714e5df7b654d40bdb0f39969c2c580161e8e8b45c9c8be884e409a45cc19a932953dc8317e36b075957df71d4"

RPROVIDES:${PN} += "python3.14dist-imread \
python314-imread \
python3dist-imread"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
python-abi \
python314-numpy"

inherit rpm
