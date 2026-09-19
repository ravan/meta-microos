SUMMARY = "Py.test plugin to store test expectations and mark tests based on them"
DESCRIPTION = "A py.test plugin that stores test expectations by saving the set of \
failing tests, allowing them to be marked as xfail when running them \
in future. The tests expectations are stored such that they can be \
distributed alongside the tests. However, note that test expectations \
can only be reliably shared between Python 2 and Python 3 if they only \
use ASCII characters in their node ids: this likely isn’t a limitation \
if tests are using the normal Python format, as Python 2 only allows \
ASCII characters in identifiers."
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python313-pytest-expect-1.1.0-5.5.noarch.rpm"
RPM_HASH = "9164d4b4521e2f3f2dbf0c2e921e738c7bdf1b4cf089c064cb62217b3b432e39428ae7f591895e5c5158db996927a18ef14f0ea17d014aa342efa5785820b4b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-expect \
python3.13dist-pytest-expect \
python313-pytest-expect \
python3dist-pytest-expect"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-six \
python313-u-msgpack-python"

inherit rpm
