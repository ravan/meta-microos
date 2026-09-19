SUMMARY = "Programming environment for audio synthesis and composition"
DESCRIPTION = "SuperCollider is a platform for audio synthesis and algorithmic composition, \
used by musicians, artists, and researchers working with sound. \
SuperCollider consists of three separate components: \
  1. scsynth or supernova - audio engine (the 'server') \
  2. sclang - programming language runtime interpreter including Qt graphical user interfaces \
  3. IDE (integrated development environment) - an editor for writing code and running supercollider"
LICENSE = "GPL-3.0-only"

PV = "3.14.1"

RPM_NAME = "supercollider-3.14.1-1.5.aarch64.rpm"
RPM_HASH = "c44944725b3c5cbf6673f150f50d9946da09179a3572aa5d61b84fb2b49dc4b08f4c247f8c33baf8cac3f246bc4169a052dd43db95ed9414587633f93f22c409"

RPROVIDES:${PN} += "supercollider"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Svg.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6WebSockets.so.6 \
libQt6Widgets.so.6 \
libX11.so.6 \
libasound.so.2 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libfftw3f.so.3 \
libgcc-s.so.1 \
libjack.so.0 \
libm.so.6 \
libreadline.so.8 \
libsndfile.so.1 \
libstdc++.so.6 \
libudev.so.1 \
pipewire-libjack-0-3"

inherit rpm
