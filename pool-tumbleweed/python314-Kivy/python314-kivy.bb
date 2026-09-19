SUMMARY = "Hardware-accelerated multitouch application library"
DESCRIPTION = "Kivy is a library for development of applications that make use of \
user interfaces, such as multi-touch apps."
LICENSE = "Apache-2.0 & MIT & LGPL-2.1-or-later & GPL-2.0-or-later & GPL-3.0-only & BSD-3-Clause"

PV = "2.3.1"

RPM_NAME = "python314-Kivy-2.3.1-5.5.aarch64.rpm"
RPM_HASH = "a1a9b369327f7a14dae809aa62654c2e5e8f02cc9001fa9af432420d952ab97ef7df02fdde360fde3c07006744ea4e4fbceb9e57fb4c868c1e2b8fd1f7fa6f9e"

RPROVIDES:${PN} += "python3.14dist-kivy \
python314-Kivy \
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
python314-Pillow \
python314-Pygments \
python314-docutils \
python314-filetype \
python314-pyenchant \
python314-requests \
xclip"

inherit rpm
