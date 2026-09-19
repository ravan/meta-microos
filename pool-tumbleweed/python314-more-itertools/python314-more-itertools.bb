SUMMARY = "More routines for operating on iterables, beyond itertools"
DESCRIPTION = "Additional building blocks, recipes, and routines for working with \
Python iterables."
LICENSE = "MIT"

PV = "11.1.0"

RPM_NAME = "python314-more-itertools-11.1.0-1.2.noarch.rpm"
RPM_HASH = "98bba5467e54fefecf88950f8f685bb08966d69235a7b7f004fc557c26c54e212a50fe5986f4569fe96f3d80c996caed61c932d84942f0058e115dbfdde33f5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-more-itertools \
python314-more-itertools \
python3dist-more-itertools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
