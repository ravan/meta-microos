SUMMARY = "Non-ABI stable experimental API for the Qt5 KMS support library"
DESCRIPTION = "This package provides private headers of libQt5KmsSupport that are \
normally not used by application development and that do not have any \
ABI or API guarantees. The packages that build against these have to \
require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5KmsSupport-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "1c93b97500fa31505ec29a0b0b7e034150e72f9b326ac7e533d097ba070914fb65cd5b0b514eb81b897c13350e14d3bd35618e82b182fd3d9efdcf471c7435d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5KmsSupport-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5KmsSupport-devel-static"

inherit rpm
