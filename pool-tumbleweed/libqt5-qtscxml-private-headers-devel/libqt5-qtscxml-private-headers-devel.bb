SUMMARY = "Non-ABI stable experimental API for Qt5's State Chart XML library"
DESCRIPTION = "This package provides private headers of libqt5-qtscxml that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtscxml-private-headers-devel-5.15.19+kde0-1.2.noarch.rpm"
RPM_HASH = "4cd23fd7190ac215bf8d59c1ea5f5f69b0ba21f7ce157d591c74e52e70e7acf09b9d556b07ccf7d28f696b9c0fb09e2b855bf5e82a929b8c35c37949ddb3dbf0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libqt5-qtscxml-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtscxml-devel"

inherit rpm
