SUMMARY = "Plugins for personal contact handling"
DESCRIPTION = "This package provides plugins required by PIM applications to read and write contact data."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-plugin-contacts-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "c48c8788893aade883455b388c9b29daa1b5e76d823dbecba1828aec50d0e6d21cb51479ecb4184761e50be32375bdf90c5aa2846a83c54f28f30fcdef66e3c9"

RPROVIDES:${PN} += "akonadi-plugin-contacts"

RDEPENDS:${PN} += "akonadi-contacts \
ld-linux-aarch64.so.1 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiCore.so.6 \
libQt6Core.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
