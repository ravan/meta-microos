SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtsensors that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtconnectivity-private-headers-devel-5.15.19+kde0-1.2.noarch.rpm"
RPM_HASH = "29d6390ba33d7e7e56766fa33061359a141b3399e415f53d30640251d00165b750719e69a75bd4f87a17a72190f12c5b8d756c38bc3805c67007b476d23bc9c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtconnectivity-private-headers-devel"

RDEPENDS:${PN} += "libqt5-qtbase-private-headers-devel \
libqt5-qtconnectivity-devel \
libqt5-qtdeclarative-private-headers-devel"

inherit rpm
