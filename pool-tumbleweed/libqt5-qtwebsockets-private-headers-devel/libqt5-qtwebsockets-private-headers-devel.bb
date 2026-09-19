SUMMARY = "Non-ABI stable experimental API for the Qt5 WebSocket library"
DESCRIPTION = "This package provides private headers of libqt5-qtwebsockets that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only |  (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde2"

RPM_NAME = "libqt5-qtwebsockets-private-headers-devel-5.15.19+kde2-1.2.noarch.rpm"
RPM_HASH = "79c8074de3cd5df8e2178d7d62a13957936e72d09108c71c6317dce3aa6448b902a31a9380bcd5689b142233e8e0fce1956357e825a5e291ebd34ed501fad511"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtwebsockets-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtwebsockets-devel"

inherit rpm
