SUMMARY = "KDE software to manage office documents in the office"
DESCRIPTION = "Kraft is KDE software to help to create and manage office documents such as \
offers and invoices in the small enterprise. \
 \
It supports easy document creation, templates with calculation, customer management \
through the KDE addressbook, highly configurable PDF output and more. \
 \
See the website http://volle-kraft-voraus.de for more information."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "2.0.0"

RPM_NAME = "kraft-2.0.0-2.1.aarch64.rpm"
RPM_HASH = "31b772be9817fbc2c82b935a9fcaaac51e8e73ee7610a38a8bb16bef1e6bfa698d0b7b911345223ab00375b46661be3d558324fb8d4b60a86068ac263222e7ee"

RPROVIDES:${PN} += "kraft"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF6ConfigCore.so.6 \
libKF6ConfigGui.so.6 \
libKF6Contacts.so.6 \
libKF6CoreAddons.so.6 \
libKF6I18n.so.6 \
libKF6TextTemplate.so.6 \
libKPim6AkonadiContactCore.so.6 \
libKPim6AkonadiContactWidgets.so.6 \
libKPim6AkonadiCore.so.6 \
libKPim6AkonadiWidgets.so.6 \
libQt6Core.so.6 \
libQt6Gui.so.6 \
libQt6Sql.so.6 \
libQt6Widgets.so.6 \
libQt6Xml.so.6 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
python3-base \
python3-pypdf \
python3-six \
python3-weasyprint \
qt6-sql-mysql \
qt6-sql-sqlite"

inherit rpm
