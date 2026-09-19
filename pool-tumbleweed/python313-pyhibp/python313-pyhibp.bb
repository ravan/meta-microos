SUMMARY = "An interface to Troy Hunt's 'Have I Been Pwned' public API"
DESCRIPTION = "A Python interface to Troy Hunt's 'Have I Been Pwned?' (HIBP) public API."
LICENSE = "AGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "python313-pyhibp-4.2.0-2.5.noarch.rpm"
RPM_HASH = "fb48d38d38fe99f2b72b26e5ea57fcf36130c87ad3a993445cf6a6b0313bef94590d23f55a694933cfb72560d3d0f924653084fff13de2f5dc65bfe0d0a0b4ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyhibp \
python3.13dist-pyhibp \
python313-pyhibp \
python3dist-pyhibp"

RDEPENDS:${PN} += "python-abi \
python313-requests"

inherit rpm
