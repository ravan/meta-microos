SUMMARY = "MIME email parser for KDE PIM - runtime plugins"
DESCRIPTION = "This package provides plugins required by PIM applications read and write parsed \
email data."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-plugin-mime-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "3563c9b7743ede510dbc8339739bf61eeb24e01be1c9e290e452b1d66019d82b982d4498f06c5f4894a551db8b78ffa9add8ec7efd964ac91bc0c2067224ae77"

RPROVIDES:${PN} += "akonadi-plugin-mime \
libakonadi-mime-quick-plugin.so \
qt6qmlimport-org.kde.akonadi.mime \
qt6qmlimport-org.kde.akonadi.mime.254"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libKF6Mime.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiMime.so.6 \
libKPim6AkonadiMime6 \
libKPim6AkonadiPrivate.so.6 \
libQt6Core.so.6 \
libQt6Qml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
