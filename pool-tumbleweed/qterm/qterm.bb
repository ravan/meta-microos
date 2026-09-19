SUMMARY = "QTerm is BBS client"
DESCRIPTION = "QTerm is a full featured BBS client written in Qt."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.4"

RPM_NAME = "qterm-0.7.4-3.10.aarch64.rpm"
RPM_HASH = "ba6b4a7cd8d029731ff8be9708bdbce3db121ef5fefcbf0e4c2bd5b72ba85843d91ec948980e18c09401af15f09a8d48de50881ee398928f11990dbdaf288aee"

RPROVIDES:${PN} += "qterm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Multimedia.so.5 \
libQt5Network.so.5 \
libQt5PrintSupport.so.5 \
libQt5Script.so.5 \
libQt5Widgets.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
