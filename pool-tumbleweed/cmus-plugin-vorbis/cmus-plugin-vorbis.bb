SUMMARY = "Vorbis input plugin for the C* Music Player"
DESCRIPTION = "This package provides Vorbis input support for the C* Music Player."
LICENSE = "GPL-2.0-only"

PV = "2.12.0"

RPM_NAME = "cmus-plugin-vorbis-2.12.0-3.6.aarch64.rpm"
RPM_HASH = "65c7d647290c99404eb2fe53399baf547e45321e8d8f949cd2321b26410f422e7ac65c552a820ba908da08999e44c495f88ea7640393c5b730e0a527b69c182e"

RPROVIDES:${PN} += "cmus-plugin-vorbis"

RDEPENDS:${PN} += "cmus \
ld-linux-aarch64.so.1 \
libc.so.6 \
libvorbisfile.so.3"

inherit rpm
