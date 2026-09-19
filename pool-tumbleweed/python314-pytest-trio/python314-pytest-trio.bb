SUMMARY = "Pytest plugin for trio"
DESCRIPTION = "This is a pytest plugin to help you test projects that use Trio, \
a friendly library for concurrency and async I/O in Python."
LICENSE = "Apache-2.0 | MIT"

PV = "0.8.0"

RPM_NAME = "python314-pytest-trio-0.8.0-5.5.noarch.rpm"
RPM_HASH = "446fa438fc1c0d5fb5b10e905a5cee603a0531b6445ae3b8b39bd28e4d3beeb48a3be46bd0a34f5bb14cfe34bbea90ed19ae35968cab347c43bce403e635994c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-trio \
python314-pytest-trio \
python3dist-pytest-trio"

RDEPENDS:${PN} += "python-abi \
python314-outcome \
python314-pytest \
python314-trio"

inherit rpm
