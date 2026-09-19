SUMMARY = "GEDCOM tools for Python"
DESCRIPTION = "GEDCOM tools for Python."
LICENSE = "MIT"

PV = "0.5.2"

RPM_NAME = "python313-ged4py-0.5.2-1.2.noarch.rpm"
RPM_HASH = "c436fef23535460b7409df6c34feb67a5c502c2fa9145c910dd7f689743efd66a5476016a0ac7271a4838e4bdbbc7fc493fd484e1a4ebf327e7b0c337e77838a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ged4py \
python3.13dist-ged4py \
python313-ged4py \
python3dist-ged4py"

RDEPENDS:${PN} += "python-abi \
python313-ansel \
python313-convertdate"

inherit rpm
