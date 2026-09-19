SUMMARY = "Non-ABI stable experimental API for the Qt5 GUI library"
DESCRIPTION = "This package provides private headers of libQt5Gui that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Gui-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "3ee04830d153ba680e429a43eb5933f2315af67c0be322ec1a4bc86f65a19e17ab6a7a6be593616fb4aab69032eb9ec08a87d128fed67b01dfce344eb9c9ca01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Gui-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-devel"

inherit rpm
