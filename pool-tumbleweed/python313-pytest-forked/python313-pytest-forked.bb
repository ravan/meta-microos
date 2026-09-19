SUMMARY = "Run each test in a forked subprocess"
DESCRIPTION = "Extraction of pytest-xdist --forked module used for running tests in forked subprocess"
LICENSE = "MIT"

PV = "1.7.5"

RPM_NAME = "python313-pytest-forked-1.7.5-1.1.noarch.rpm"
RPM_HASH = "e691a999c63adbb155a51c10123011073ed3f290247dc1692d34390aed82fb5171e2a172216867b3af77f15eef83ad899e0f2163818d665f1a1230e9d841837d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-forked \
python3.13dist-pytest-forked \
python313-pytest-forked \
python3dist-pytest-forked"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
