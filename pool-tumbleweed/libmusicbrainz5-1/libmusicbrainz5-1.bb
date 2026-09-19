SUMMARY = "Library That Provides Access to the MusicBrainz Server"
DESCRIPTION = "MusicBrainz is the second generation incarnation of the CD Index. This \
server is designed to enable audio CD, MP3 and Vorbis players to \
download metadata about the music they are playing."
LICENSE = "LGPL-2.1-or-later"

PV = "5.1.0"

RPM_NAME = "libmusicbrainz5-1-5.1.0-2.10.aarch64.rpm"
RPM_HASH = "9d0826da28bdd5ed8e003a6967d2468c91d96709f254d2b3d1cd62349d1305425b2e531b11e196f373923a2232d6ecb72262297ab29f0ea4e798362da57a3ce2"

RPROVIDES:${PN} += "libmusicbrainz5-1 \
libmusicbrainz5.so.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libneon.so.27 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
