SUMMARY = "HTTP client mocking tool for Python"
DESCRIPTION = "This library allows mocking of HTTP protocol based \
unit tests. \
It is similar to Ruby's FakeWeb."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python314-httpretty-1.1.4-15.2.noarch.rpm"
RPM_HASH = "8d29362523325d4086b8fa49ba63c6851531d88f3a7fe1e2a9dabdf07a30b0b101158b07a83ad8638e76b5b23a0dd99e7da93de6962135c34b77437ddcc801e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-httpretty \
python314-httpretty \
python3dist-httpretty"

RDEPENDS:${PN} += "python-abi"

inherit rpm
