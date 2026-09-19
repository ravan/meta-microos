SUMMARY = "Library for personal contact handling"
DESCRIPTION = "This package provides a library used for handling personal contacts, \
as part of the KDE Personal Information Management (PIM) software."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AkonadiContactCore6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "8bdfa929cd01656b011e71cd99fd7ecde63f39c8aa218339e691173ca1e5a044bc898298cad0eb95b66ed8e6d54327c451fa79c4dd66cff0b576fd8d559fbf1c"

RPROVIDES:${PN} += "libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactCore6"

RDEPENDS:${PN} += "/sbin/ldconfig \
akonadi-contacts \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6GuiAddons.so.6 \
libKF6I18n.so.6 \
libKF6IconThemes.so.6 \
libKF6Mime.so.6 \
libKF6TextTemplate.so.6 \
libKF6TextUtils.so.1 \
libKPim6AkonadiCore.so.6 \
libKPim6GrantleeTheme.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
