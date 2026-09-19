SUMMARY = "Fast Audio Playlist Generator"
DESCRIPTION = "FAPG (Fast Audio Playlist Generator) is a tool to generate list of audio files \
(Wav, MP3, Ogg, etc) in various formats (M3U, PLS, HTML, etc). It is designed \
for speed even for large lists, and automation use."
LICENSE = "GPL-2.0-or-later"

PV = "0.45"

RPM_NAME = "fapg-0.45-1.4.aarch64.rpm"
RPM_HASH = "7993c6da1581b63cf80d512bc30f94042abd5fe98697ee4008198e69a23e403a0e8187fed563562760d44aa70688a5cdb816d30c18d959724709ba67d0918134"

RPROVIDES:${PN} += "fapg"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liburiparser.so.1"

inherit rpm
