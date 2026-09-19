SUMMARY = "The QT EchoLink Client"
DESCRIPTION = "This package contains Qtel, the Qt EchoLink client. It is an implementation of \
the EchoLink software in Qt. This is only an EchoLink client, that is it can not \
be connected to a transciever to create a link. If it is a pure link node you \
want, install the svxlink-server package."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "qtel-1.3.0-7.1.aarch64.rpm"
RPM_HASH = "1c457d4f9c9c4ac681f4be46dce74fd4ab7f72d1dfda983dfa5d31e41ac8c61157ecd6205fe88fa8fabefa237ab976682707436d52823af612a6357f70f067f7"

RPROVIDES:${PN} += "qtel"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core5Compat.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Widgets.so.6 \
libasyncaudio.so.1.9 \
libasynccore.so.1.9 \
libasyncqt.so.1.9 \
libc.so.6 \
libecholib.so.1.3 \
libgcc-s.so.1 \
libgsm.so.1 \
libm.so.6 \
libsigc-2.0.so.0 \
libstdc++.so.6"

inherit rpm
