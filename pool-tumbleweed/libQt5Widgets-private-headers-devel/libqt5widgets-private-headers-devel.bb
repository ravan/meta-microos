SUMMARY = "Non-ABI stable experimental API for the Qt5 widgets library"
DESCRIPTION = "This package provides private headers of libQt5Widgets that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Widgets-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "eca76faab597bf4039ba3361d8d62736372ba4f44edaef8131b8f69d9613e2b533b2380a344de62e6a8589712f1104418c2360eaed7f6bc9a1ddbb153e8e76eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Widgets-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5Widgets-devel"

inherit rpm
