SUMMARY = "Python bindings for FFmpeg's libraries"
DESCRIPTION = "Pythonic bindings for FFmpeg's libraries."
LICENSE = "BSD-3-Clause"

PV = "18.1.0"

RPM_NAME = "python314-av-18.1.0-1.1.aarch64.rpm"
RPM_HASH = "1ced23a01fc1b9dcd5b921cf595f5f6b11ef7a16b19b81884c33d1413a981e42d08b2e0fdfdc4f663cfe5112c090175abdd447a2932d325fd68863000b5d738b"

RPROVIDES:${PN} += "python3.14dist-av \
python314-av \
python3dist-av"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
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
python314-numpy \
update-alternatives"

inherit rpm
