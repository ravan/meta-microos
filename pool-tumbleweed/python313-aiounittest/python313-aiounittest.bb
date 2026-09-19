SUMMARY = "Test AyncIO Python Code Easily"
DESCRIPTION = "This is a helper library to ease of your pain (and boilerplate), when writing a \
test of the asynchronous code (asyncio). You can test: \
 \
* synchronous code (same as the unittest.TestCase) \
* asynchronous code, it supports syntax with async/await (Python 3.5+) and \
  asyncio.coroutine/yield from (Python 3.4)"
LICENSE = "MIT"

PV = "1.5.0"

RPM_NAME = "python313-aiounittest-1.5.0-2.4.noarch.rpm"
RPM_HASH = "7c2ec2c620a4836aeb8765e2790b57d2bc75818e51f2560e3c3db6d6d13d27f2286bc1b1c7ae6536f3a83dc4ecbeeba75e4b0c8a69459b47cbb86a7a2b22eb2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-aiounittest \
python3.13dist-aiounittest \
python313-aiounittest \
python3dist-aiounittest"

RDEPENDS:${PN} += "python-abi \
python313-wrapt"

inherit rpm
