SUMMARY = "A mock library for Python"
DESCRIPTION = "Minimock is a library for doing Mock objects with doctest. \
When using doctest, mock objects can be very simple."
LICENSE = "MIT"

PV = "1.3.0"

RPM_NAME = "python314-MiniMock-1.3.0-2.10.noarch.rpm"
RPM_HASH = "9e610e55f255d22da739738f58e7988b0a6dfd3dde533b208ffed15c14755438b89035d879153d8e292a8db87239684fad859a85ea35423b59f3ba4518000b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-minimock \
python314-MiniMock \
python3dist-minimock"

RDEPENDS:${PN} += "python-abi"

inherit rpm
