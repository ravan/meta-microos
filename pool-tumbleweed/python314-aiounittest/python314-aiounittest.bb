SUMMARY = "Test AyncIO Python Code Easily"
DESCRIPTION = "This is a helper library to ease of your pain (and boilerplate), when writing a \
test of the asynchronous code (asyncio). You can test: \
 \
* synchronous code (same as the unittest.TestCase) \
* asynchronous code, it supports syntax with async/await (Python 3.5+) and \
  asyncio.coroutine/yield from (Python 3.4)"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python314-aiounittest-1.5.0-2.4.noarch.rpm"
RPM_HASH = "64af664ba0b87b1a5673519220382502cc15e67171ebad4ee77602906cfa0e4b82ab800e8c6abbaa89b549685525c52da8d4b924982ecf4195eded3e1339665f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-aiounittest \
python314-aiounittest \
python3dist-aiounittest"

RDEPENDS:${PN} += "python-abi \
python314-wrapt"

inherit rpm
