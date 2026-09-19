SUMMARY = "Collection of Cmyk Profiles from basICColor"
DESCRIPTION = "More printing profiles according to ISO 12647-2. This are all remaining \
CMYK ICC profiles for ISO Printing conditions from the 2009 set. \
The ISOcoated_v2_bas.ICC profile is packaged separately."
LICENSE = "Zlib"

PV = "1.2.0"

RPM_NAME = "icc-profiles-basiccolor-printing2009-extra-1.2.0-13.25.noarch.rpm"
RPM_HASH = "bd1cb9c5f91214db43a3d4e6219a23c521cbb56b2b5d7f2a84d63b7d2d3bd440ef0ae8158cbdb2b465c2807c3a4d020baa16e2b862e383a4a97b591c2695b7ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-basiccolor-printing2009-extra"

RDEPENDS:${PN} += "icc-profiles-basiccolor-printing2009-coat2"

inherit rpm
