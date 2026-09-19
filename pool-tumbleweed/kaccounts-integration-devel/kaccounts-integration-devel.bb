SUMMARY = "KDE Accounts Providers - Development Files"
DESCRIPTION = "Small system to administer web accounts for the sites and services across the \
Plasma desktop, including: Google, Facebook, Owncloud, IMAP, Jabber and others. \
This package provides development files."
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kaccounts-integration-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "568e9cab1e851290aaf14061bb976b6a4c18b71e8ff767e8b26fc9eb12020d45cf8ac09eff2e543368722e3e21100a33f13106448a4e6707b40345191ee08ba0"

RPROVIDES:${PN} += "cmake-KAccounts6 \
kaccounts-integration-devel"

RDEPENDS:${PN} += "cmake-AccountsQt6 \
cmake-KF6CoreAddons \
cmake-Qt6Widgets \
cmake-SignOnQt6 \
intltool \
libkaccounts6-2 \
pkgconfig-libaccounts-glib"

inherit rpm
