SUMMARY = "KDE Frameworks based address book API"
DESCRIPTION = "kcontacts is a Qt library which provides an API \
to access address book data stored in different formats."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "libKF6Contacts6-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "ea38b025a6b217c266171a761a8f965bbc0069be1f01a295e15573552a12b9bf0348d280fbc43d86957c3d528bbd7e8527318cb5fb3abeffb8e7e8578b09703a"

RPROVIDES:${PN} += "libKF6Contacts.so.6 \
libKF6Contacts6"

RDEPENDS:${PN} += "/sbin/ldconfig \
kf6-kcontacts \
ld-linux-aarch64.so.1 \
libKF6Codecs.so.6 \
libKF6ConfigCore.so.6 \
libKF6I18n.so.6 \
libKF6I18nLocaleData.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
