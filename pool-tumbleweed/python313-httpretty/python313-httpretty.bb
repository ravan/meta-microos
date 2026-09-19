SUMMARY = "HTTP client mocking tool for Python"
DESCRIPTION = "This library allows mocking of HTTP protocol based \
unit tests. \
It is similar to Ruby's FakeWeb."
LICENSE = "MIT"

PV = "1.1.4"

RPM_NAME = "python313-httpretty-1.1.4-15.2.noarch.rpm"
RPM_HASH = "1c1e8ce85ed9f8956f8e25da96f63c59d736a4731bc8312ad2146bafb8a4c58fe3bce6dd4c78ab006eb763ad15ca1dcab51fe2cc704d9ffced52daa008a753fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-httpretty \
python3.13dist-httpretty \
python313-httpretty \
python3dist-httpretty"

RDEPENDS:${PN} += "python-abi"

inherit rpm
