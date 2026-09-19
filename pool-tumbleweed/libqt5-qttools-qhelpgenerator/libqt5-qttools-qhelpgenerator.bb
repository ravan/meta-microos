SUMMARY = "Generator for Qt5 Help files (qch)"
DESCRIPTION = "Binaries for generating .qch help catalogs."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde3"

RPM_NAME = "libqt5-qttools-qhelpgenerator-5.15.19+kde3-1.8.aarch64.rpm"
RPM_HASH = "800eced603e8a67e01347f3b8cf0c1cb07fe98ccd1e1e42776641a7f5697715b903425038b68dc32fe3a8a6bc60b0fb035e729b78b036145555ca9dadecedea9"

RPROVIDES:${PN} += "libqt5-qttools-qhelpgenerator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Help.so.5 \
libQt5Sql.so.5 \
libQt5Sql5-sqlite \
libc.so.6 \
libstdc++.so.6"

inherit rpm
