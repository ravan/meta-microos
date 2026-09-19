SUMMARY = "GAP: Universal Groups Acting LocallY"
DESCRIPTION = "UGALY (Universal Groups Acting LocallY) is a GAP package that \
provides methods to create, analyse and find local actions of \
generalised universal groups acting on locally finite regular trees, \
following Burger-Mozes and Tornier."
LICENSE = "GPL-3.0-or-later"

PV = "4.1.3"

RPM_NAME = "gap-ugaly-4.1.3-1.9.noarch.rpm"
RPM_HASH = "eadc36f892fc6282f997bb456e1efd535b72f4183fd1404fbc51926af2852e58676d6cbf6d1b94fce96f658c0e2e17afe325a7c7654a4f58973e6db8a4eef37d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-ugaly"

RDEPENDS:${PN} += "gap-core \
gap-fga"

inherit rpm
