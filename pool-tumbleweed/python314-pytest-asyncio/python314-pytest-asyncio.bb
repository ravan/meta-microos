SUMMARY = "Pytest support for asyncio"
DESCRIPTION = "pytest-asyncio is a Python library used for testing asyncio code with pytest. \
 \
asyncio code is usually written in the form of coroutines, which makes it \
slightly more difficult to test using normal testing tools. pytest-asyncio \
provides useful fixtures and markers to make testing easier."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python314-pytest-asyncio-1.3.0-1.4.noarch.rpm"
RPM_HASH = "63c592b841ffcc03c77a0d3e2e33d94445c708450e4b9ee749f3cc5faf5771b0deba104a16f1af359228d8cc4cd34f0cd9d3ef47299dce84c88340aa4057b873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-asyncio \
python314-pytest-asyncio \
python3dist-pytest-asyncio"

RDEPENDS:${PN} += "-python314-pytest >= 8.2.0 with python314-pytest < 10 \
python-abi"

inherit rpm
