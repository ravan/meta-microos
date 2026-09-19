SUMMARY = "Library which provides import/export functionality for KAddressbook"
DESCRIPTION = "This library provides an interface to implement import/export plugins for KAddressbook."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libKPim6AddressbookImportExport6-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "d953a05244b7f66041b12d2efde09d189aef8cb13219da07deaf87d37072d91135ed7be0e31655262095da5dd1d2c3441150894d2e212da502c884b52d9e1ed2"

RPROVIDES:${PN} += "libKPim6AddressbookImportExport.so.6 \
libKPim6AddressbookImportExport6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6TextAddonsWidgets.so.1 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiWidgets.so.6 \
libKPim6PimCommon.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Widgets.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
