SUMMARY = "Affine transformation matrices"
DESCRIPTION = "Matrices describing affine transformation of the plane."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python314-affine-3.0.1-1.1.noarch.rpm"
RPM_HASH = "409168ae400788a40d916109c8c0f10f3f2420167c923fc9d7a0ad3d615b141f5c7e4ce31e3341bdc0b43329c834a853fb9aa5296db794d97bd631de63e9d6db"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-affine \
python314-affine \
python3dist-affine"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python314-attrs"

inherit rpm
