SUMMARY = "E-book plugin and library"
DESCRIPTION = "Mobipocket E-book plugin and library. \
 \
This package provides development files for kdegraphics-mobipocket \
library"
LICENSE = "GPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kdegraphics-mobipocket-devel-26.08.1-1.1.aarch64.rpm"
RPM_HASH = "07a47e4e3434683a008087e90aee22762a90ccdb7176ceaef3dc9a201103f5fb9b0472414d06271ae6c833dbc1fbd475a1b4adc9d8001bd1b9d776b8493ef7ea"

RPROVIDES:${PN} += "cmake-QMobipocket6 \
kdegraphics-mobipocket-devel"

RDEPENDS:${PN} += "libQMobipocket6-3"

inherit rpm
