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

RPM_NAME = "python313-imread-0.7.6-1.9.aarch64.rpm"
RPM_HASH = "df5bd2b94a3a1ce9c908954124ab52cfdf87dc60df487eb81cbc8b651c7b21424592fb3849ec7e36f072231b96701614c6a8fe4e63270bb78e990f5095c5aa46"

RPROVIDES:${PN} += "python3-imread \
python3.13dist-imread \
python313-imread \
python3dist-imread"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libjpeg.so.8 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
python-abi \
python313-numpy"

inherit rpm
