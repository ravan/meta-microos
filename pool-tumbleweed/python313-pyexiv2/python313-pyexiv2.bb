SUMMARY = "A Python library for reading and writing image metadata"
DESCRIPTION = "A Python library for reading and writing image metadata, including EXIF, IPTC, XMP, ICC Profile."
LICENSE = "GPL-3.0-only"

PV = "2.15.5"

RPM_NAME = "python313-pyexiv2-2.15.5-1.1.noarch.rpm"
RPM_HASH = "049a3ab21dbb0fefd94bca9d8ef1977536edbb7f6fa9928fe3f6431927b42be86827ed9022e255e637838a04d0ae33252114777e1b7eb424ff16414b109722a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyexiv2 \
python3.13dist-pyexiv2 \
python313-pyexiv2 \
python3dist-pyexiv2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
