SUMMARY = "Single Cmyk Profile from basICColor"
DESCRIPTION = "Printing profile according to ISO 12647-2. This is one CMYK \
ICC profile for a ISO Printing condition."
LICENSE = "Zlib"

PV = "1.2.0"

RPM_NAME = "icc-profiles-basiccolor-printing2009-coat2-1.2.0-13.25.noarch.rpm"
RPM_HASH = "0c84c4e2642389b4c84742a6233734e063ca9392ed1097c5606e22e9026c52d82dc493e52b4c8c22c748a592fa9b75b22856c61dc189750bddb7ecb6acb0c744"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-basiccolor-printing2009-coat2"

RDEPENDS:${PN} += "color-filesystem"

inherit rpm
