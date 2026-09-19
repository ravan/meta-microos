SUMMARY = "Run each test in a forked subprocess"
DESCRIPTION = "Extraction of pytest-xdist --forked module used for running tests in forked subprocess"
LICENSE = "MIT"

PV = "1.7.5"

RPM_NAME = "python314-pytest-forked-1.7.5-1.1.noarch.rpm"
RPM_HASH = "c7e3488fdf6527420af8e4231813023f73a1f8572968ab58ff03c22b1f53380370cfbbdce06a42c72241629572c45b06eccabbdd6609d7cd061e552cbee98173"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-forked \
python314-pytest-forked \
python3dist-pytest-forked"

RDEPENDS:${PN} += "python-abi \
python314-pytest"

inherit rpm
