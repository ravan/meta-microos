SUMMARY = "GUI for mediainfo"
DESCRIPTION = "This package contains a Frontend for mediainfo. \
 \
MediaInfo supplies technical and tag information about a video or \
audio file."
LICENSE = "GPL-2.0-or-later"

PV = "26.05"

RPM_NAME = "mediainfo-gui-26.05-1.2.aarch64.rpm"
RPM_HASH = "a27de7fb3985695ac198870d46d3075669887c4d73386b51b5c9ea4fb5c92df1113c0d500dc7e358427090560bbdf2399de85e8210db2d7fc37a3e965e1a486d"

RPROVIDES:${PN} += "MediaInfo-gui \
mediainfo-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmediainfo.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.16.0.0 \
libwx-gtk2u-core-suse.so.16.0.0 \
libwx-gtk2u-html-suse.so.16.0.0 \
libzen.so.0"

inherit rpm
