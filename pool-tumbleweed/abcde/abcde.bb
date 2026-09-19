SUMMARY = "Front-end program to a number of utilities for encoding a CD to files"
DESCRIPTION = "A front-end program to cdparanoia, wget, cd-discid, id3, and a \
custom Ogg or MP3 encoder, defaulting to oggenc. It grabs an entire CD \
and converts each track to Ogg or MP3, and then comments or adds ID3 \
tags to each file."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.3"

RPM_NAME = "abcde-2.9.3-8.6.noarch.rpm"
RPM_HASH = "d4b4a6567b903e2d5d78d5195c6601d30556a21b2f41fbb4b13eb67c56a845393e4884969b7b358e4e186c2160f218362a694c81f972351fff42afa7ef0e5232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "abcde \
config-abcde"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/perl \
cd-discid \
cdparanoia \
perl-MusicBrainz--DiscID \
perl-WebService--MusicBrainz \
wget"

inherit rpm
