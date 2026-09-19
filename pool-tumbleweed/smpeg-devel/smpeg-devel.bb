SUMMARY = "Development files for libsmpeg"
DESCRIPTION = "SMPEG is a MPEG-1 video player library with sound support. Video \
playback is based on the Berkeley MPEG player, mpeg_play v2.2. Audio \
is played through a modified mpegsound library, part of Splay v0.8.2. \
SMPEG supports MPEG-1 Layer 3 audio, MPEG-1 video, and MPEG system \
streams."
LICENSE = "LGPL-2.0-only"

PV = "0.4.5"

RPM_NAME = "smpeg-devel-0.4.5-3.12.aarch64.rpm"
RPM_HASH = "b2ed51bdd63ce1a9e41d6061de5d4c0d1c4f53f14a5d53d1b4716dec2a64bc8a79ec3bfecf9b4ab4a8ae3846be22da0e2a517e0f3fd653d0457b669aa00f5760"

RPROVIDES:${PN} += "smpeg-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libsmpeg-0-4-0"

inherit rpm
