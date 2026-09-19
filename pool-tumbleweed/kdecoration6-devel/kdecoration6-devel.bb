SUMMARY = "KDE's window decorations library (development package)"
DESCRIPTION = "Development files belonging to kdecoration, \
plugin based library to create window decorations."
LICENSE = "GPL-2.0-or-later"

PV = "6.7.5"

RPM_NAME = "kdecoration6-devel-6.7.5-1.1.aarch64.rpm"
RPM_HASH = "0d6cfa969bad61906cefd78d170bd95c20b21dccd8963de661c2045b17ed8d74e97ed686c8a5a89f0c8b0ce2e0af50ff456e4632ea13cf9875374f83b485f0e2"

RPROVIDES:${PN} += "cmake-KDecoration3 \
kdecoration6-devel"

RDEPENDS:${PN} += "cmake-Qt6Gui \
libkdecorations3-6 \
libkdecorations3private2"

inherit rpm
