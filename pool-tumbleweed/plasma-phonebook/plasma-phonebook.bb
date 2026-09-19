SUMMARY = "Plasma Mobile Phonebook"
DESCRIPTION = "A phone book application for Plasma Mobile."
LICENSE = "GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "plasma-phonebook-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "24e4f01e08d8c5b2b30246296945b26352f72621cca856bcd627ebb9390f11817984e5916bfdcae07012cf06e8271fb7793909c31182d3a85ee7f78777841981"

RPROVIDES:${PN} += "plasma-phonebook"

RDEPENDS:${PN} += "kf6-kcontacts-imports \
kf6-kirigami-imports \
kf6-kpeople-imports \
kirigami-addons6 \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6People.so.6 \
libKF6PeopleBackend.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Qml.so.6 \
libQt6Quick.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libstdc++.so.6 \
qt6-declarative-imports \
qt6-qt5compat-imports"

inherit rpm
