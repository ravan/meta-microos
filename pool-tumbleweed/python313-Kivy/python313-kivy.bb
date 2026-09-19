SUMMARY = "Hardware-accelerated multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python313-Kivy-2.3.1-5.5.aarch64.rpm"
RPM_HASH = "c99a238e195a724f8b7321557a5a91e7105f61a74b58144944349af4d0a83703823d9e6aa039028b2b0a14cf190bbc0eab85dc142a135fb217a33ad267d2376f"

RPROVIDES:${PN} += "python3-Kivy \
python3.13dist-kivy \
python313-Kivy \
python3dist-kivy"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libSDL2-2.0.so.0 \
libSDL2-image-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libSDL2-ttf-2.0.so.0 \
libc.so.6 \
libfontconfig.so.1 \
libfreetype.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
mtdev \
python-abi \
python313-Pillow \
python313-Pygments \
python313-docutils \
python313-filetype \
python313-pyenchant \
python313-requests \
xclip"

inherit rpm
