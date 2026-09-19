SUMMARY = "Non-ABI stable experimental API for the Qt5 core library"
DESCRIPTION = "This package provides private headers of libQt5Core that are normally \
not used by application development and that do not have any ABI or \
API guarantees. The packages that build against these have to require \
the exact Qt version."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.19+kde96"

RPM_NAME = "libQt5Core-private-headers-devel-5.15.19+kde96-1.3.noarch.rpm"
RPM_HASH = "fbf504d7ff7710304a8337e0e8beca68253878ce58d969b42cbbde7121ef646457525c2229e781fcd636f25ff938450173de3ee428f58e8f156f842915f91b98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libQt5Core-private-headers-devel"

RDEPENDS:${PN} += "libQt5Core-devel"

inherit rpm
