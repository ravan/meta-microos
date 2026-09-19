SUMMARY = "Non-ABI stable experimental API"
DESCRIPTION = "This package provides private headers of libqt5-qtdeclarative that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde23"

RPM_NAME = "libqt5-qtdeclarative-private-headers-devel-5.15.19+kde23-1.3.noarch.rpm"
RPM_HASH = "2fe0d5a79f25867183c9fcf0f60ed9191b945e760a1107aa1e2745d13d3981bc6e846b403962fc1ae836f9c6c4c4da74196ae6c2d8f03292b630f8f74feac740"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Quick-private-headers-devel \
libqt5-qtdeclarative-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5Test-private-headers-devel \
libQt5Widgets-private-headers-devel \
libqt5-qtdeclarative-devel"

inherit rpm
