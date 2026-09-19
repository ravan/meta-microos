SUMMARY = "A customisable music player built with Qt"
DESCRIPTION = "fooyin is a Qt6 music player built around customisation. It offers a \
growing list of widgets to manage and play a local music collection. \
It is extendable through the use of plugins, and many widgets make \
use of FooScript to offer an even deeper level of control."
LICENSE = "GPL-3.0-only"

PV = "0.9.2"

RPM_NAME = "fooyin-0.9.2-3.1.aarch64.rpm"
RPM_HASH = "3f1cba4e9bdc4fec9a47f1a7a488f556c374368b6b623d3b2ab3ec7ad21458da938632a44ce8dba9439da9630d48ffe932a6108592600d8d05d3ae4dccb995bd"

RPROVIDES:${PN} += "fooyin \
libfooyin-core.so.0.0.0 \
libfooyin-gui.so.0.0.0 \
libfooyin-utils.so.0.0.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libSDL2-2.0.so.0 \
libarchive.so.13 \
libasound.so.2 \
libavcodec.so.62 \
libavfilter.so.11 \
libavformat.so.62 \
libavutil.so.60 \
libc.so.6 \
libgcc-s.so.1 \
libicui18n.so.78 \
libkdsingleapplication-qt6.so.1.2 \
libm.so.6 \
libopenmpt.so.0 \
libpipewire-0.3.so.0 \
libsndfile.so.1 \
libstdc++.so.6 \
libswresample.so.6 \
libtag.so.2 \
qt6-sql-sqlite"

inherit rpm
