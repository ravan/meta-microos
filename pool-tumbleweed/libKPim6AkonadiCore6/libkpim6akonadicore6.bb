SUMMARY = "Core Akonadi Server library"
DESCRIPTION = "This package includes the core Akonadi library, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiCore6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "ac18d43b3dc2a64588ab91265df6b99b53c88c8444d0b11299aa211093a5e42e082121f6a5f5524ee1859689449d307b15239ca51a7cff92975bd98648fbecc9"

RPROVIDES:${PN} += "libKPim6AkonadiCore.so.6 \
libKPim6AkonadiCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6ItemModels.so.6 \
libKPim6AkonadiPrivate.so.6 \
libQt6Core.so.6 \
libQt6DBus.so.6 \
libQt6Gui.so.6 \
libQt6Network.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
