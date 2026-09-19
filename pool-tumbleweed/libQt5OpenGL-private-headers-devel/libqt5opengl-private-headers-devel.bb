SUMMARY = "Non-ABI stable experimental API for the Qt5 OpenGL library"
DESCRIPTION = "This package provides private headers of libQt5OpenGL that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5OpenGL-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "c5312e3171df67845f3785e72c178a96017e255e36015c8cd5dd9e115584857d6fbb2ac6e80e9887add33ed3563ec1aa56f41716564a3b1ffd26439a1d38fc59"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5OpenGL-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5OpenGL-devel \
libQt5Widgets-private-headers-devel"

inherit rpm
