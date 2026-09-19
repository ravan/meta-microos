SUMMARY = "Development files for the KLatexFormula backend library"
DESCRIPTION = "A C++/Qt library to generate images (PNG, EPS, PDF, plus all Qt-supported image \
formats) from LaTeX equations. \
 \
This library implements the base functionality of KLatexFormula. \
 \
This package contains the needed files for development. \
 \
See also packages klatexformula-devel and libklfbackend-qt3-devel"
LICENSE = "GPL-2.0-or-later"

PV = "4.1.0"

RPM_NAME = "klfbackend-devel-4.1.0-1.26.aarch64.rpm"
RPM_HASH = "c08a048683cdb6cd9b4c9e492156fb0286fc1cb9bc14544e59c92f02d008e6179514ae1718ce8fb90864992d0578036047190d865dd019ea14eadf217c7be0af"

RPROVIDES:${PN} += "klfbackend-devel \
libklfbackend-devel"

RDEPENDS:${PN} += "libklfbackend"

inherit rpm
