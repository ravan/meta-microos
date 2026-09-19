SUMMARY = "A mock library for Python"
DESCRIPTION = "Minimock is a library for doing Mock objects with doctest. \
When using doctest, mock objects can be very simple."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python313-MiniMock-1.3.0-2.10.noarch.rpm"
RPM_HASH = "678d3f669531e197947f1817c2546e18a989e80dff2d1d78d7311dd2c2d87954053ed44419f318df172b9c77af3c187e3a1e8f5fb0f94d9242ff037f0dc4cc20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MiniMock \
python3.13dist-minimock \
python313-MiniMock \
python3dist-minimock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
