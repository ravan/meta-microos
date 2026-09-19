SUMMARY = "Multimedia player, library manager and media server"
DESCRIPTION = "Kawaii-Player is an audio/video manager and multimedia player based on mpv \
and can also work as media server."
LICENSE = "GPL-3.0-or-later"

PV = "8.1.0.1"

RPM_NAME = "kawaii-player-8.1.0.1-1.1.aarch64.rpm"
RPM_HASH = "5d50f9557a6914411df021efff6a4eda320b469688ddcc02432338202142d5598d6f371a9296c774eb190c268fd341a6066f2101223251c792bc6a54b3caf48d"

RPROVIDES:${PN} += "kawaii-player \
python3.13dist-kawaii-player \
python3dist-kawaii-player"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
ffmpegthumbnailer \
ld-linux-aarch64.so.1 \
libc.so.6 \
libmpv.so.2 \
python-abi \
python3-Pillow \
python3-base \
python3-beautifulsoup4 \
python3-certifi \
python3-libtorrent-rasterbar \
python3-lxml \
python3-mutagen \
python3-opengl \
python3-pycurl \
python3-pytaglib \
python3-qt5 \
python3-qtwebengine-qt5 \
youtube-dl"

inherit rpm
