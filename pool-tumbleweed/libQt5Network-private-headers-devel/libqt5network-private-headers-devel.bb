SUMMARY = "Non-ABI stable experimental API for the Qt5 network library"
DESCRIPTION = "This package provides private headers of libQt5Network that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Network-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "763974c34214d951e494c14bdeda59273287211c99da721084218d8875469f5a34bff24e48bb6ac52f1712a4f7799033aaaf830f66987c64fb66482270d9406a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Network-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Network-devel"

inherit rpm
