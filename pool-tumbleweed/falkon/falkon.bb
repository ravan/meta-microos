SUMMARY = "Modern web browser"
DESCRIPTION = "Falkon is a web browser designed to well integrate with all \
common Linux desktops like GNOME and KDE Plasma. \
It supports current web standards and comes with many features, \
such as an integrated ad blocker. \
 \
It was previously known as QupZilla."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "falkon-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "b6d1e5356412501b9796373255263ad265fefccdae60d7464f329abb5f28612ad0a654f52ba0a5b8a6c2aed348083d3529a4d66ade085dd68bf2b535b6d04fdc"

RPROVIDES:${PN} += "falkon \
falkon-gnome-keyring \
libFalkonPrivate.so.3 \
qupzilla \
web-browser"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6Archive.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6PrintSupport.so.6 \
libQt6Qml.so.6 \
libQt6QuickWidgets.so.6 \
libQt6Sql.so.6 \
libQt6WebChannel.so.6 \
libQt6WebEngineCore.so.6 \
libQt6WebEngineWidgets.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxcb.so.1 \
qt6-sql-sqlite"

inherit rpm
