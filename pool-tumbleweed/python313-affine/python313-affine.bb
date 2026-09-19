SUMMARY = "Affine transformation matrices"
DESCRIPTION = "Matrices describing affine transformation of the plane."
LICENSE = "BSD-3-Clause"

PV = "3.0.1"

RPM_NAME = "python313-affine-3.0.1-1.1.noarch.rpm"
RPM_HASH = "a011ca76c51a10ef6b0564a85fa2d1ec15c60df00f3d51ac308c23d00f12f1aef6111b2f79c64d69836395435e947395b0b46d48e8bd7892f748245c5254f85f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-affine \
python3.13dist-affine \
python313-affine \
python3dist-affine"

RDEPENDS:${PN} += "python-abi \
python313-attrs \
python314-attrs"

inherit rpm
