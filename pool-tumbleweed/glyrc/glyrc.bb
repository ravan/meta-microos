SUMMARY = "Search engine for music related metadata"
DESCRIPTION = "This subpackage contains the Glyr CLI tool. \
 \
The sort of metadata glyr is searching (and downloading) is usually the \
data you see in your music player. It was originally written \
to serve as internal library for a music player, but has been extended \
to work as a standalone program which is able to download: \
 \
* cover art; \
* lyrics; \
* bandphotos; \
* artist biography; \
* album reviews; \
* tracklists of an album; \
* a list of albums from a specific artist; \
* tags, either related to artist, album or title relations, for example \
  links to Wikipedia; \
* similar artists; \
* similar songs."
LICENSE = "LGPL-3.0-or-later"

PV = "1.0.10"

RPM_NAME = "glyrc-1.0.10-5.4.aarch64.rpm"
RPM_HASH = "4805d3d30fde3ace1b0b78f8cd419784505d9071a855d085d0623622816d2cffabe501536f38f65b663fd2051bdbd5347cac3f34e5b35a574dc8dda9a5ee7c4d"

RPROVIDES:${PN} += "glyr \
glyrc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libglyr.so.1"

inherit rpm
