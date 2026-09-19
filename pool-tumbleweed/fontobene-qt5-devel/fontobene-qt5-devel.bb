SUMMARY = "FontoBene parser for Qt5 (header-only)"
DESCRIPTION = "A header-only library to parse FontoBene stroke fonts with C++/Qt5."
LICENSE = "Apache-2.0 | MIT"

PV = "0.2.0"

RPM_NAME = "fontobene-qt5-devel-0.2.0-1.16.aarch64.rpm"
RPM_HASH = "6d17b7b4e06c9e8af82c2916bdf8b817e8a8b2a4dbd552dbe2ca25788b86683a6e42f7b39a8e7a7da61b51517316f8870702d0e59d8fbeeca3971fa189b25432"

RPROVIDES:${PN} += "fontobene-qt5-devel \
pkgconfig-fontobene-qt5"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-Qt5Core"

inherit rpm
