SUMMARY = "Minimal locale archive for very small systems"
DESCRIPTION = "This package contains a glibc locale archive with the C.UTF-8 and \
en_US.UTF-8 locale for very minimal systems only supporting \
english as locale."
LICENSE = "GPL-2.0+ & MIT & LGPL-2.1+"

PV = "2.44"

RPM_NAME = "kubic-locale-archive-2.44-3.28.noarch.rpm"
RPM_HASH = "b3d20ce9520b9d9e7e12302b2f99d45a874502609ee3dce91180d605dba374028bb10a7d10c166cace3d27669f1b27a52cff88384f217dc782391fd178727609"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubic-locale-archive"

RDEPENDS:${PN} += "glibc"

inherit rpm
