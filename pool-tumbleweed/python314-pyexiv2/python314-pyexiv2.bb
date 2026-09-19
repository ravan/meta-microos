SUMMARY = "A Python library for reading and writing image metadata"
DESCRIPTION = "A Python library for reading and writing image metadata, including EXIF, IPTC, XMP, ICC Profile."
LICENSE = "GPL-3.0-only"

PV = "2.15.5"

RPM_NAME = "python314-pyexiv2-2.15.5-1.1.noarch.rpm"
RPM_HASH = "583e8046f8addbc5255f48dd43e161c37a57f0518b753bf54c14781c64c574811480fb020b882e5273b612e3d36ea48f090ed3a4418e99b982740a3fc7946a16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyexiv2 \
python314-pyexiv2 \
python3dist-pyexiv2"

RDEPENDS:${PN} += "python-abi"

inherit rpm
