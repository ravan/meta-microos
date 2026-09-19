SUMMARY = "OpenICC Data with all ICC profiles and targets"
DESCRIPTION = "The meta package installs all ICC profiles from the OpenICC Data collection."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-all-1.2-16.29.noarch.rpm"
RPM_HASH = "e26aa654111b2efa6341b4b1f220ab3f7b6ca2f02ee3c81754d14fdfcb08407e74217a9b3591e8cc117f53ec14b300a5eebdd5bb49cde9ea933d272d663cc8c2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-all"

RDEPENDS:${PN} += "icc-profiles \
icc-profiles-basiccolor-printing2009-extra \
icc-profiles-oyranos-extra"

inherit rpm
