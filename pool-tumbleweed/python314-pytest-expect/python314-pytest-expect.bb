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

RPM_NAME = "python314-pytest-expect-1.1.0-5.5.noarch.rpm"
RPM_HASH = "fcc563f5ecb04f86b8330ef3e0b1c5d7f17a3cc96f16b950ba80ea6f4915a7a425a55d2958e8b449ba87a642842f03b582f65cbca87569734fcb2fa4df06c65d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-expect \
python314-pytest-expect \
python3dist-pytest-expect"

RDEPENDS:${PN} += "python-abi \
python314-pytest \
python314-six \
python314-u-msgpack-python"

inherit rpm
