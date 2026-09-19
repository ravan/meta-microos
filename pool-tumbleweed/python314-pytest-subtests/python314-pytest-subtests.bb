SUMMARY = "Python unittest subTest() support and subtests fixture"
DESCRIPTION = "Python unittest subTest() support and subtests fixture."
LICENSE = "MIT"

PV = "0.15.0"

RPM_NAME = "python314-pytest-subtests-0.15.0-1.2.noarch.rpm"
RPM_HASH = "b8019e77a4b821364f0b3ca774fe5206924e46ab5986865101ec8b486d402309109d855ca85271c15da9974ff586e002e64bb760aeaed8efffcb6b7de371e307"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-subtests \
python314-pytest-subtests \
python3dist-pytest-subtests"

RDEPENDS:${PN} += "python-abi \
python314-attrs \
python314-pytest"

inherit rpm
