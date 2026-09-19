SUMMARY = "A tilemap editor"
DESCRIPTION = "Tiled is a general purpose tile map editor. It is built to work with \
varying game engines, whether your game is an RPG, platformer or \
Breakout clone. Tiled is written in C++, using the Qt application \
framework."
LICENSE = "GPL-2.0-or-later"

PV = "1.12.2"

RPM_NAME = "tiled-1.12.2-1.2.aarch64.rpm"
RPM_HASH = "9bddadc1787b2b9c81ac0fe75eab2a4d8cbf8deef82430aa20e0b00bc7cb587ca0155476b1506fd543cdffc5b94b3f42dfe0232981701893cca1eea1d8a55ecf"

RPROVIDES:${PN} += "libcsv.so \
libdefold.so \
libdefoldcollection.so \
libdroidcraft.so \
libflare.so \
libgmx.so \
libjson.so \
libjson1.so \
liblua.so \
libreplicaisland.so \
librpd.so \
librpmap.so \
libtbin.so \
libtengine.so \
libtiled.so \
libtilededitor.so \
libtscn.so \
libyy.so \
tiled \
tiled-qt"

RDEPENDS:${PN} += "/usr/bin/sh \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6OpenGLWidgets.so.6 \
libQt6Qml.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
