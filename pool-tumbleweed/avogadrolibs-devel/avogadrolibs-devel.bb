SUMMARY = "Header files for Avogadro libraries"
DESCRIPTION = "Header files for Avogadro libraries."
LICENSE = "Apache-2.0 & BSD-3-Clause & CDDL-1.0 & GPL-3.0-or-later"

PV = "1.100.0"

RPM_NAME = "avogadrolibs-devel-1.100.0-3.6.aarch64.rpm"
RPM_HASH = "07cbe0a265ab5bdc4589cc3e1660cd03efdebb664e0bfbbae85deefa9c4a621ddf2ce822140fdbf589df6acb1a25b86b05bf095c3af2e3f152805bc9dbdcb146"

RPROVIDES:${PN} += "avogadrolibs-devel \
cmake-AvogadroLibs"

RDEPENDS:${PN} += "avogadrolibs-plugins \
cmake-Qt6Concurrent \
cmake-Qt6Core \
cmake-Qt6Gui \
cmake-Qt6Network \
cmake-Qt6OpenGLWidgets \
cmake-Qt6Widgets \
eigen3-devel \
libAvogadro1 \
pkgconfig-gl \
pkgconfig-glew"

inherit rpm
