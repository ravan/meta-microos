SUMMARY = "LeechCraft Azoth XMPP Module"
DESCRIPTION = "This package provides an XMPP protocol plugin for LeechCraft Azoth. \
 \
Feature highlights: \
 * Media calls support (Jingle). \
 * Support for PEP and current user activity, mood, tune and location. \
 * Bookmarks with autojoin support. \
 * Full support for MUCs. \
 * Notifications about chat state participation. \
 * Service discovery support. \
 * Gateway support, with registration. \
 * Support for various file transfer methods. \
 * In-band registration of accounts (right from the client). \
 * Privacy lists. \
 * Encrypted and signed messages and presences. \
 * Full CAPTCHA support. \
 * Support for ad-hoc commands. \
 * Support for exchanging roster items. \
 * Search for contacts in Jabber."
LICENSE = "BSL-1.0"

PV = "0.6.70+git.18808.g3467692359"

RPM_NAME = "leechcraft-azoth-xoox-0.6.70+git.18808.g3467692359-3.1.aarch64.rpm"
RPM_HASH = "23c593fdb517082644e3d63b0a02b1ae44177ac9a5c40cc7095d6681c348e5d670b9ebf3d7cecdd54dd9daacf7363ad63c52f57449164283996168250e45e318"

RPROVIDES:${PN} += "leechcraft-azoth-protocolplugin \
leechcraft-azoth-xoox \
libleechcraft-azoth-xoox.so"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
leechcraft-azoth \
libQXmppQt6.so.10 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libleechcraft-azoth-util-qt6.so.0.6.75 \
libleechcraft-util-db-qt6.so.0.6.75 \
libleechcraft-util-gui-qt6.so.0.6.75 \
libleechcraft-util-network-qt6.so.0.6.75 \
libleechcraft-util-qt6.so.0.6.75 \
libleechcraft-util-sll-qt6.so.0.6.75 \
libleechcraft-util-sys-qt6.so.0.6.75 \
libleechcraft-util-threads-qt6.so.0.6.75 \
libleechcraft-util-xpc-qt6.so.0.6.75 \
libleechcraft-xsd-qt6.so.0.6.75 \
libqca-qt6.so.2 \
libstdc++.so.6"

inherit rpm
