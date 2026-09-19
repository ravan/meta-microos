SUMMARY = "Non-ABI stable experimental API for the Qt5 print support library"
DESCRIPTION = "This package provides private headers of libQt5PrintSupport that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5PrintSupport-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "63eace3f4c749df44fedf8d1e9ba36bf05a262fa082942a39cb63e1c43982acc2a15a755ff5e83a6a49bc8309cb99cae37e943119f2dd5095bc73a24cad66310"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5PrintSupport-private-headers-devel"

RDEPENDS:${PN} += "cups-devel \
libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5PrintSupport-devel \
libQt5Widgets-private-headers-devel"

inherit rpm
