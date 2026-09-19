SUMMARY = "A media player with UI using libmpv"
DESCRIPTION = "Baka MPlayer is a libmpv-based multimedia player. It supports gesture \
seeking, desktop dimming, hardware accelerated playback (vdpau, \
vaapi, vda) and Youtube playback support (and others)."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "2.0.4"

RPM_NAME = "baka-mplayer-2.0.4-5.18.aarch64.rpm"
RPM_HASH = "11a821fde4a129d864cdf5317bff9b3cbd0851b6c58f9cd60e63e14127d321cd3ba9966cde5e8a24a12657db1346175f2ea495f3fa50057970383c82527a0aa8"

RPROVIDES:${PN} += "baka-mplayer"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libX11.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libmpv.so.2 \
libstdc++.so.6"

inherit rpm
