SUMMARY = "ANSI text color library for Python"
DESCRIPTION = "Yet another ANSI color text library for Python. It provides 'auto \
colors' for dark/light terminals. \
 \
In Python 2.x, this library subclasses `unicode`, while on \
Python 3.x, it subclasses `str`."
LICENSE = "MIT"

PV = "2.2.2"

RPM_NAME = "python313-colorclass-2.2.2-3.9.noarch.rpm"
RPM_HASH = "bed279d14dbce94611dd862f7e3ba7cfe5b68de5d6e3d143728ca4f9b2a6662845081fee4e9417d61110f4c1cc5929d478d8384998372dacd3d410725fc0996d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-colorclass \
python3.13dist-colorclass \
python313-colorclass \
python3dist-colorclass"

RDEPENDS:${PN} += "python-abi"

inherit rpm
