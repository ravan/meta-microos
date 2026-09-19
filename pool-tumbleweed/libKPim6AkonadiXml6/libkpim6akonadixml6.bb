SUMMARY = "Akonadi Xml library"
DESCRIPTION = "This package includes the Akonadi Xml library for Akonadi, the KDE PIM storage service."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiXml6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f9aecdcb73f11acbd64ce563465d50518ab5fa4d15ac69dd4684c4dbdd8987b36255aea6fa81145d806e357851a297c317af0fad1f249d0af796fbd95c1fae2a"

RPROVIDES:${PN} += "libKPim6AkonadiXml.so.6 \
libKPim6AkonadiXml6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKPim6AkonadiCore.so.6 \
libQt6Core.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
libxml2.so.16"

inherit rpm
