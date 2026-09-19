SUMMARY = "Pytest support for asyncio"
DESCRIPTION = "pytest-asyncio is a Python library used for testing asyncio code with pytest. \
 \
asyncio code is usually written in the form of coroutines, which makes it \
slightly more difficult to test using normal testing tools. pytest-asyncio \
provides useful fixtures and markers to make testing easier."
LICENSE = "Apache-2.0"

PV = "1.3.0"

RPM_NAME = "python313-pytest-asyncio-1.3.0-1.4.noarch.rpm"
RPM_HASH = "8f473dd78233304e75d228ba8effd6fe905b2489df1e8be12d6db41349f1de9e4d6196d89b5f3508bce1a8775a3cebcc1ef23b06a8eae1f1662020b1b8bf2c7f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-asyncio \
python3.13dist-pytest-asyncio \
python313-pytest-asyncio \
python3dist-pytest-asyncio"

RDEPENDS:${PN} += "-python313-pytest >= 8.2.0 with python313-pytest < 10 \
python-abi"

inherit rpm
