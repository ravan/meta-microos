SUMMARY = "Audio Streaming Server"
DESCRIPTION = "Icecast is a MP3 and OGG streaming server able to serve many clients \
with MP3 and OGG audio."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.4"

RPM_NAME = "icecast-2.4.4-5.8.aarch64.rpm"
RPM_HASH = "70a10ca8fc76b19ae62e6f18ed11cf5370c827789980eb9e3df832ef5ec8a1970ac1dfea40fbe3d3135219ee5546ae5a635e5d4b662e993384900d533b9798eb"

RPROVIDES:${PN} += "config-icecast \
group-icecast \
icecast \
user-icecast"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libogg.so.0 \
libspeex.so.1 \
libssl.so.3 \
libtheora.so.1 \
libvorbis.so.0 \
libxml2.so.16 \
libxslt.so.1 \
shadow \
systemd"

inherit rpm
