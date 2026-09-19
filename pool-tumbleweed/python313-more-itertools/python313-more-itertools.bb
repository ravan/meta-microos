SUMMARY = "More routines for operating on iterables, beyond itertools"
DESCRIPTION = "Additional building blocks, recipes, and routines for working with \
Python iterables."
LICENSE = "MIT"

PV = "11.1.0"

RPM_NAME = "python313-more-itertools-11.1.0-1.2.noarch.rpm"
RPM_HASH = "319088d69c4eb8ed5696e0733b4f2d4e4c114afa04c9a91a4f3e0b16b1aa5e949ae79b425c7a91741a1bf9e3f5d41c0ddd42039425a12596a0a38c05fee5cc52"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-more-itertools \
python3.13dist-more-itertools \
python313-more-itertools \
python3dist-more-itertools"

RDEPENDS:${PN} += "python-abi"

inherit rpm
