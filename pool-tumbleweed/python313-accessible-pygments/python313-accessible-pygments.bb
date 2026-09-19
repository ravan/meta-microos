SUMMARY = "A collection of accessible pygments styles"
DESCRIPTION = "A collection of accessible pygments styles"
LICENSE = "BSD-3-Clause"

PV = "0.0.5"

RPM_NAME = "python313-accessible-pygments-0.0.5-1.5.noarch.rpm"
RPM_HASH = "4722b718e374f7739ebbb2d71ced6366c10a246aa08e5adead84c159aa8d1c6c5b791c65c8b2624d666cb193a14e255a6332fbadbf1daafc0d4122d76824d851"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-accessible-pygments \
python3.13dist-accessible-pygments \
python313-accessible-pygments \
python3dist-accessible-pygments"

RDEPENDS:${PN} += "python-abi \
python313-pygments"

inherit rpm
