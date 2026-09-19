SUMMARY = "KDE PIM Libraries: Build Environment"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop KDE PIM applications."
LICENSE = "LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "akonadi-contacts-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "f941b9676423bcd9337e70020ce0b44d27bc4166ca5b8bf7e7f02a0be82a75cb00159107d779a205776ece751098d5d6a79e1c163331c8afeda0dd1354bd7dea"

RPROVIDES:${PN} += "akonadi-contacts-devel \
cmake-KPim6AkonadiContactCore \
cmake-KPim6AkonadiContactWidgets"

RDEPENDS:${PN} += "cmake-KF6Contacts \
cmake-KPim6Akonadi \
cmake-KPim6AkonadiContactCore \
cmake-KPim6GrantleeTheme \
cmake-Qt6Widgets \
libKPim6AkonadiContactCore6 \
libKPim6AkonadiContactWidgets6"

inherit rpm
