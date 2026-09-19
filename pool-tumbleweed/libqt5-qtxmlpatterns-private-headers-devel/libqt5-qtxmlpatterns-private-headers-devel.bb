SUMMARY = "Non-ABI stable experimental API for the Qt5 XML Patterns library"
DESCRIPTION = "This package provides private headers of libqt5-qtxmlpatterns that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "(LGPL-3.0-only | (GPL-2.0-only | GPL-3.0-or-later)) & GPL-3.0-only-with-Qt-GPL-exception-1.0"

PV = "5.15.19+kde0"

RPM_NAME = "libqt5-qtxmlpatterns-private-headers-devel-5.15.19+kde0-1.2.noarch.rpm"
RPM_HASH = "04fb1e99514ca52bc5069ea190de48dad5bcb3850b5de6cf8218e9b160e671e7255be76c53552518da4d611c12f01d9297c3e495a92c4185d0d2cf491f3ee3ac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5XmlPatterns-private-headers-devel \
libqt5-qtxmlpatterns-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-private-headers-devel \
libqt5-qtxmlpatterns-devel"

inherit rpm
