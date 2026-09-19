SUMMARY = "Additional statistical methods for agate"
DESCRIPTION = "Agate-stats adds statistical methods to agate."
LICENSE = "MIT"

PV = "0.4.3"

RPM_NAME = "python313-agate-stats-0.4.3-1.4.noarch.rpm"
RPM_HASH = "97883d148e720c8c0294d0e15739e3864c2d1630f67f9917ee75bda39818056b3aea1f4a6493f181de87219beddfd9e019c0b780fbac6e9a57bc20e0312cd95f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-agate-stats \
python3.13dist-agate-stats \
python313-agate-stats \
python3dist-agate-stats"

RDEPENDS:${PN} += "python-abi \
python313-agate \
python313-six"

inherit rpm
