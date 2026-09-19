SUMMARY = "Non-ABI stable experimental API for the Qt5 Location Library"
DESCRIPTION = "This package provides private headers of libqt5-qtlocation that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde7"

RPM_NAME = "libqt5-qtlocation-private-headers-devel-5.15.19+kde7-1.2.noarch.rpm"
RPM_HASH = "573f3b4b92ddf1da0f511e7a4ab3335110de1defd971e7b7b7d30809fa5b142733b5cf3c47fe3a9c13731d9f860fd1457cf40473b95d2a23f0519c0a3f8a8f53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtlocation-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtdeclarative-private-headers-devel \
libqt5-qtlocation-devel"

inherit rpm
