SUMMARY = "Dictionary Lookup Program"
DESCRIPTION = "The Next Generation GoldenDict: A feature-rich dictionaries lookup program, \
supporting many dictionary formats."
LICENSE = "GPL-3.0-only & GPL-3.0-or-later"

PV = "26.5.0"

RPM_NAME = "goldendict-ng-26.5.0-3.1.aarch64.rpm"
RPM_HASH = "f140f74cbe5f8a95e266403917bc343ea94dda90891c3335b78068f5b46fb72d99c6a0f7563eb815dd2a0cb4d42b5bd396d0834a08141b2700c3f49f13835627"

RPROVIDES:${PN} += "goldendict \
goldendict-ng"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libX11.so.6 \
libXtst.so.6 \
libavcodec.so.62 \
libavformat.so.62 \
libavutil.so.60 \
libbz2.so.1 \
libc.so.6 \
libeb.so.16 \
libfmt.so.12 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
liblzma.so.5 \
liblzo2.so.2 \
libm.so.6 \
libopencc.so.1.2 \
libstdc++.so.6 \
libswresample.so.6 \
libtomlplusplus.so.3 \
libvorbisfile.so.3 \
libxapian.so.30 \
libz.so.1 \
libzim.so.9 \
qt6-multimedia"

inherit rpm
