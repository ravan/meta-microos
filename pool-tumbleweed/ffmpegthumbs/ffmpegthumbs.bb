SUMMARY = "FFmpeg-based thumbnail creator for video files"
DESCRIPTION = "FFmpeg-based thumbnail creator for video files."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "ffmpegthumbs-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "5ac699e567e365a38495ff1862246a94fa4e0df04071e7b044b843c9a7ed81c29c8eeb8edf9b5848da893aab20c7040128db044444f36c479b48933508280414"

RPROVIDES:${PN} += "ffmpegthumbs"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6CoreAddons.so.6 \
libKF6KIOGui.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libm.so.6 \
libstdc++.so.6 \
libswscale.so.9"

inherit rpm
