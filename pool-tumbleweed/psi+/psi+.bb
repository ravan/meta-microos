SUMMARY = "Jabber client using Qt"
DESCRIPTION = "Psi is the premiere Instant Messaging application designed for \
GNU/Linux, Microsoft Windows, Apple Mac OS X. Built upon an open \
protocol named Jabber, Psi is a fast and lightweight messaging client \
that utilises the best in open source technologies. Psi contains all \
the features necessary to chat, with no bloated extras that slow your \
computer down."
LICENSE = "Apache-2.0 & GPL-2.0-or-later"

PV = "1.5.2112+0"

RPM_NAME = "psi+-1.5.2112+0-1.6.aarch64.rpm"
RPM_HASH = "e82a899606cabfce961a5ff0333556e379a33ffef5575a0024548c8902d7e6e27b2a33d26761b5655e5e440debbd34e2cb87657eb27195f357ca3911e8b73a10"

RPROVIDES:${PN} += "psi+"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt6Concurrent.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Multimedia.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Svg.so.6 \
libQt6SvgWidgets.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libX11.so.6 \
libXss.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libhunspell-1.7.so.0 \
libm.so.6 \
libqca-qt6.so.2 \
libqt6keychain.so.1 \
libstdc++.so.6 \
libusrsctp.so.2 \
libz.so.1 \
psi+-data"

inherit rpm
