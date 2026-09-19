SUMMARY = "Default PCS profiles"
DESCRIPTION = "Special LCMS profiles for PCS color spaces."
LICENSE = "Zlib"

PV = "1.2"

RPM_NAME = "icc-profiles-lcms-lab-1.2-16.29.noarch.rpm"
RPM_HASH = "a6bd3580f12e8c642a00c1f8307cdb997f506b521646f170a34f61c403158483a8c2f2d1e721f53a068b4af39c6ece69b88bec0783778e93d038c52903e4259b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icc-profiles-lcms-lab"

RDEPENDS:${PN} += "color-filesystem"

inherit rpm
