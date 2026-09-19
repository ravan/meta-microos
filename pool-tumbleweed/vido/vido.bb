SUMMARY = "Online Video Downloader"
DESCRIPTION = "This tool downloads online videos from various sources including \
archive.org and others."
LICENSE = "GPL-3.0-or-later"

PV = "2.3.0"

RPM_NAME = "vido-2.3.0-2.11.aarch64.rpm"
RPM_HASH = "e7223c67460e273e477a7d42fb565eafb0253a4d9c2c39afd1a3b4083c7da540adef9ce0207fabdf7b1c458761ce51691957fc4a609987992163e0f8c22f990c"

RPROVIDES:${PN} += "vido"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgranite.so.6 \
libgtk-3.so.0 \
libhandy-1.so.0 \
yt-dlp-youtube-dl"

inherit rpm
