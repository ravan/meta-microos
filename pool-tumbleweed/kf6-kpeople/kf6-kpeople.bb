SUMMARY = "Library for access to contacts and identity holders"
DESCRIPTION = "A library that provides access to all contacts and the people who hold them."
LICENSE = "LGPL-2.1-or-later"

PV = "6.30.0"

RPM_NAME = "kf6-kpeople-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "61dc817f9c8700e0308b1f4ab88f60cbffc5714414676bce4bcb0f7588980e2874b8f5f07bc790245fa1fc8d75e7cd3387513df35aa877c81a48dfbf68f412f4"

RPROVIDES:${PN} += "kf6-kpeople"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6PeopleBackend.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
