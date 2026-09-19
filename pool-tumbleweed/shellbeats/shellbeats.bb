SUMMARY = "Terminal music player for YouTube"
DESCRIPTION = "A terminal music player that integrates with YouTube. It allows users to search, stream, and \
download tracks directly from the command line using mpv and yt-dlp as backend tools.The interface supports shuffle mode, seek controls, and background downloads."
LICENSE = "GPL-3.0-only"

PV = "0.7"

RPM_NAME = "shellbeats-0.7-1.3.aarch64.rpm"
RPM_HASH = "28e7cf3b99ba5e8136e8377099cbbbac979d6ee4ad4377477232d637b8f072ee9c2c76ad21225aa0478ec02cef3531e9f2680555b06d0322ef9125f9d4150557"

RPROVIDES:${PN} += "shellbeats"

RDEPENDS:${PN} += "libc.so.6 \
libcjson.so.1 \
libcurl.so.4 \
libncurses.so.6 \
libtinfo.so.6 \
mpv \
yt-dlp"

inherit rpm
