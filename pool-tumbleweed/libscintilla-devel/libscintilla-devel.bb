SUMMARY = "Development files for Scintilla, a code editing component"
DESCRIPTION = "Scintilla is a code editing component. It includes features for \
editing and debugging source code, such as syntax styling, error \
indicators, code completion and call tips. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the Scintilla library."
LICENSE = "MIT"

PV = "5.6.3"

RPM_NAME = "libscintilla-devel-5.6.3-1.3.aarch64.rpm"
RPM_HASH = "2a10ba8288125df872a4a66d25c696cb846c5e0d2636620d2fd7bb15d0f599f003df193c76190f7a3299246384366e75a157398247e90c9da579ae5b45260378"

RPROVIDES:${PN} += "libscintilla-devel"

RDEPENDS:${PN} += "libscintilla5 \
pkgconfig \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
