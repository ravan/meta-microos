SUMMARY = "Library That Provides Access to the MusicBrainz Server"
DESCRIPTION = "MusicBrainz is the second generation incarnation of the CD Index. This \
server is designed to enable audio CD, MP3 and Vorbis players to \
download metadata about the music they are playing."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libmusicbrainz-devel-5.1.0-2.10.aarch64.rpm"
RPM_HASH = "5845699174484ed6c709077590c275796b2f869c282668622e455cb943e7fdf5abc7dd4631d6f6824c507516720cdc13c41bd61ee4740e4adad6a91cffc8d309"

RPROVIDES:${PN} += "libmusicbrainz-devel \
libmusicbrainz5-devel \
pkgconfig-libmusicbrainz5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmusicbrainz5-1 \
libstdc++-devel \
pkgconfig-libxml-2.0 \
pkgconfig-neon"

inherit rpm
