SUMMARY = "Files to develop against libmpg123"
DESCRIPTION = "The mpg123 distribution contains an MPEG 1.0/2.0/2.5 audio player/decoder for \
layers 1, 2 and 3 (most commonly MPEG 1.0 Layer 3 aka MP3), as well as re-usable decoding \
and output libraries."
LICENSE = "LGPL-2.1-only"

PV = "1.33.7"

RPM_NAME = "mpg123-devel-1.33.7-1.1.aarch64.rpm"
RPM_HASH = "4abaac3cbd6f52ab078ca7488a128cc3d70c9434b585d9d5e180e352b96b9df762b623ef97e9f7d9eca055ffe80645378007ab576169804552e4736e29b1654c"

RPROVIDES:${PN} += "mpg123-devel \
pkgconfig-libmpg123 \
pkgconfig-libout123 \
pkgconfig-libsyn123"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpg123-0 \
libout123-0 \
libsyn123-0"

inherit rpm
