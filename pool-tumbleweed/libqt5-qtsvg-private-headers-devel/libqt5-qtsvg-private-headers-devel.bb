SUMMARY = "Non-ABI stable experimental API for the Qt5 SVG library"
DESCRIPTION = "This package provides private headers of libqt5-qtsvg that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde5"

RPM_NAME = "libqt5-qtsvg-private-headers-devel-5.15.19+kde5-1.3.noarch.rpm"
RPM_HASH = "ecba43d436e3cc39101378c12ce4d0f44ac3a0f6f1936e43ccd508a54949a6f8201fcdfc8c499fbccf5fe7cee85d9d333908ed76f7b82077254ccc7c30f157fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Svg-private-headers-devel \
libqt5-qtsvg-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtsvg-devel"

inherit rpm
