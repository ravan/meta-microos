SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "12.3.0"

RPM_NAME = "python314-Pillow-12.3.0-2.2.aarch64.rpm"
RPM_HASH = "4740c77803711c99d36318b4569479002ce323630ad16e5ddffda192b570b6f8758ed698abb1c529c098bc6e7043d87282041bd633663407c385f6b29bbcbf85"

RPROVIDES:${PN} += "python3.14dist-pillow \
python314-PIL \
python314-Pillow \
python314-imaging \
python3dist-pillow"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libavif.so.16 \
libc.so.6 \
libfreetype.so.6 \
libimagequant.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
libm.so.6 \
libopenjp2.so.7 \
libtiff.so.6 \
libwebp.so.7 \
libwebpdemux.so.2 \
libwebpmux.so.3 \
libxcb.so.1 \
libz.so.1 \
python-abi \
python314-olefile"

inherit rpm
