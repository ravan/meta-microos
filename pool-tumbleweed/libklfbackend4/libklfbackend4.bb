SUMMARY = "KLatexFormula backend library (Qt4)"
DESCRIPTION = "A C++/Qt library to generate images (PNG, EPS, PDF, plus all Qt-supported image \
formats) from LaTeX equations. \
 \
This library implements the base functionality of KLatexFormula. This library \
is compiled for Qt 4. \
 \
See also packages klatexformula and libklfbackend-qt3."
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "libklfbackend4-4.1.0-1.26.aarch64.rpm"
RPM_HASH = "acc3012b1fa72c5393ec29eda0a90d956e0896fd59db3e78a32054ad55bba2f0e29fcdd41110115461767634ab6005cf06169e9a8c9333e47eb7028ac7391a4b"

RPROVIDES:${PN} += "libklfbackend \
libklfbackend.so.4 \
libklfbackend4"

RDEPENDS:${PN} += "/sbin/ldconfig \
gs \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Xml.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libklftools.so.4 \
libstdc++.so.6 \
texlive-latex"

inherit rpm
