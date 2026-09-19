SUMMARY = "SDL MPEG Player Library"
DESCRIPTION = "SMPEG is a MPEG-1 video player library with sound support. Video \
playback is based on the Berkeley MPEG player, mpeg_play v2.2. Audio \
is played through a modified mpegsound library, part of Splay v0.8.2. \
SMPEG supports MPEG-1 Layer 3 audio, MPEG-1 video, and MPEG system \
streams."
LICENSE = "LGPL-2.0-only"

PV = "0.4.5"

RPM_NAME = "libsmpeg-0_4-0-0.4.5-3.12.aarch64.rpm"
RPM_HASH = "685dba7073fdde1dfa37307d273f87d502803f09890f3cfd6b8f2a1764c968434f35d7a23a538756d78ab22f7777618b55f1b940faa208de3f3b7a63d653689b"

RPROVIDES:${PN} += "libsmpeg-0-4-0 \
libsmpeg-0.4.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
