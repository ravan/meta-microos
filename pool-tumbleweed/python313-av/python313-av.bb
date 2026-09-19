SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "18.1.0"

RPM_NAME = "python313-av-18.1.0-1.1.aarch64.rpm"
RPM_HASH = "4609fdf535b2c6fc5d6d709b4908a4815d8590d25928282d581715430c9e06874d981d3248f428dee99a327a95becaf2e0e43a36574c0d6b1404b691b527dc99"

RPROVIDES:${PN} += "python3-av \
python3.13dist-av \
python313-av \
python3dist-av"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavcodec.so.62 \
libavdevice.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libswresample.so.6 \
libswscale.so.9 \
python-abi \
python313-numpy \
update-alternatives"

inherit rpm
