SUMMARY = "A grab-bag of cool code"
DESCRIPTION = "big is a Python package of small functions and classes \
that aren't big enough to get a package of their own. \
It's zillions of useful little bits of \
Python code I always want to have handy."
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "python314-big-0.14-1.1.noarch.rpm"
RPM_HASH = "dbdd7e4b1326e02eff74ccac49f0c167ebdaf6e31f04b5413ddc73a2bb1d69bb1e316e6e081235a372e88a549cf274d7f15e8d51b6df4147a2d05cdf49ed1a55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-big \
python314-big \
python3dist-big"

RDEPENDS:${PN} += "python-abi"

inherit rpm
