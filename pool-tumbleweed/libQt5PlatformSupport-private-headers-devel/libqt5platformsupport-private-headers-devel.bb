SUMMARY = "Non-ABI stable experimental API for the  Qt5 platform support library"
DESCRIPTION = "This package provides private headers of libQt5PlatformSupport that \
are normally not used by application development and that do not have \
any ABI or API guarantees. The packages that build against these have \
to require the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5PlatformSupport-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "8f005a774439ae314ea26c581ec71f3e0cc383596abfd3e701d4283d1767f8788320799bce78967468c71e5822b5014ab1b5dcae20d04b9ac89a54ce9651f8f1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5PlatformSupport-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libQt5Gui-private-headers-devel \
libQt5PlatformSupport-devel-static"

inherit rpm
