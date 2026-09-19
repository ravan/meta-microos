SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the 'friendly' PIL fork by Alex Clark and Contributors. PIL is the \
Python Imaging Library by Fredrik Lundh and Contributors."
LICENSE = "HPND"

PV = "12.3.0"

RPM_NAME = "python313-Pillow-12.3.0-2.2.aarch64.rpm"
RPM_HASH = "0b0270e2093f4e8dacf56fe51b1bf7572dc79eea62b45a413d24a36fbd4ca387530f78c880d0189ad47bdcce2f86fea7d70aea050d837caad59b2b9cb24c1cb0"

RPROVIDES:${PN} += "python3-PIL \
python3-Pillow \
python3-imaging \
python3.13dist-pillow \
python313-PIL \
python313-Pillow \
python313-imaging \
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
python313-olefile"

inherit rpm
