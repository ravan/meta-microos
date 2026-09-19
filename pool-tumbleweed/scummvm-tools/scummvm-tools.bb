SUMMARY = "ScummVM-related tools"
DESCRIPTION = "This is a collection of various tools that may be useful to use in \
conjunction with ScummVM. \
Please note that although a tool may support a feature, certain ScummVM \
versions may not. ScummVM 0.6.x does not support FLAC audio, for example. \
 \
Many games package together all their game data in a few big archive files. \
The following tools can be used to extract these archives, and in some cases \
are needed to make certain game versions usable with ScummVM. \
 \
The following tools can also be used to analyze the game scripts \
(controlling the behavior of certain scenes and actors in a game). \
These tools are most useful to developers."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "scummvm-tools-2.9.0-1.6.aarch64.rpm"
RPM_HASH = "c0886d9a48484d02be7ab53184131b7f68b40bebb1f72baa349bc0b1702a6a55a0469f961c6564e5a8d73749267aded2e67a77bd5d4cc1ed35791cd7dee77a63"

RPROVIDES:${PN} += "scummvm-tools"

RDEPENDS:${PN} += "libFLAC.so.14 \
libc.so.6 \
libfreetype.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libogg.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libvorbis.so.0 \
libvorbisenc.so.2 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libz.so.1"

inherit rpm
