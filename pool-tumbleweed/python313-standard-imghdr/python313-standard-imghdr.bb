SUMMARY = "Standard library imghdr redistribution"
DESCRIPTION = "Standard library imghdr redistribution. 'dead battery'."
LICENSE = "PSF-2.0"

PV = "3.13.0"

RPM_NAME = "python313-standard-imghdr-3.13.0-1.5.noarch.rpm"
RPM_HASH = "11a8894ca8b18fe6ac4d1b6146c5a20bd4b4e3508549d6de52b7d0d6320c95034cca8edb2417cd0206b907ba32313884ecb7452297fc37d3aca302f74a937afb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-standard-imghdr \
python3.13dist-standard-imghdr \
python313-standard-imghdr \
python3dist-standard-imghdr"

RDEPENDS:${PN} += "python-abi"

inherit rpm
