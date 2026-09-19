SUMMARY = "A grab-bag of cool code"
DESCRIPTION = "big is a Python package of small functions and classes \
that aren't big enough to get a package of their own. \
It's zillions of useful little bits of \
Python code I always want to have handy."
LICENSE = "MIT"

PV = "0.14"

RPM_NAME = "python313-big-0.14-1.1.noarch.rpm"
RPM_HASH = "b4b92d93d1b27293f55951d639f8381d3f22e24736cdee10ba4cc2bd1b308d97805d4f75e5e7a0a61d2cb868e1e32f20ea0dffda0ec3f43e5ce4fbf22217c843"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-big \
python3.13dist-big \
python313-big \
python3dist-big"

RDEPENDS:${PN} += "python-abi"

inherit rpm
