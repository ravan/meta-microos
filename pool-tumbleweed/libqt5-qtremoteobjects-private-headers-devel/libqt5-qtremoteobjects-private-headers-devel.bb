SUMMARY = "Non-ABI stable experimental API for the Qt5 RemoteObjects library"
DESCRIPTION = "This package provides private headers of libqt5-qtremoteobjects that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtremoteobjects-private-headers-devel-5.15.19+kde0-1.3.noarch.rpm"
RPM_HASH = "ee0694e249750b2eefec27577fbe6174ace8388d335e714eb34e357aaff6c2389121e3300b56aa684f76330336cdb6c647bb626cfaccc886261cd17e29bdf43b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtremoteobjects-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtremoteobjects-devel"

inherit rpm
