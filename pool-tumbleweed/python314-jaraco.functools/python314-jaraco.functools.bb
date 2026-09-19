SUMMARY = "Tools to work with functools"
DESCRIPTION = "jaraco.functools Tools for working with functools. \
Additional functools in the spirit of stdlib’s functools."
LICENSE = "MIT"

PV = "4.6.0"

RPM_NAME = "python314-jaraco.functools-4.6.0-1.1.noarch.rpm"
RPM_HASH = "7ee47b63a4fc4814093984a5ad58577b7c1bdce7c1ad06d390d6784c9c0a0186bc99e73063f168184acc9e93f156764c68c65058866172935328846a386d33e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-jaraco.functools \
python314-jaraco.functools \
python3dist-jaraco.functools"

RDEPENDS:${PN} += "python-abi \
python314-more-itertools"

inherit rpm
