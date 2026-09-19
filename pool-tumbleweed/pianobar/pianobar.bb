SUMMARY = "Pandora Player"
DESCRIPTION = "pianobar is a console client for the personalized web radio pandora \
 \
- play and manage (create, add more music, delete, rename, ...) your stations \
- rate played songs and let pandora explain why they have been selected \
- show upcoming songs/song history \
- configure keybindings \
- last.fm scrobbling support (external application) \
- proxy support for listeners outside the USA"
LICENSE = "MIT"

PV = "2024.12.21"

RPM_NAME = "pianobar-2024.12.21-1.6.aarch64.rpm"
RPM_HASH = "46865c9d276e10db65c59dc96a6c3cf551e76e7928e023929c1cdbc733efb53b8e73ac0929452cc16f28279f3f08d0056f581540bbd0694ca590f677921b75fc"

RPROVIDES:${PN} += "pianobar"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libao.so.4 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libcurl.so.4 \
libgcrypt.so.20 \
libjson-c.so.5"

inherit rpm
