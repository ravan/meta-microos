SUMMARY = "A pyunit extension for dependency injection"
DESCRIPTION = "testscenarios provides clean dependency injection for Python unittest style \
tests. This can be used for interface testing (testing many implementations via \
a single test suite) or for classic dependency injection (provide tests with \
dependencies externally to the test code itself, allowing easy testing in \
different situations)."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python313-testscenarios-0.6.2-1.3.noarch.rpm"
RPM_HASH = "fdea222d8e73a4ae44444747b1c088fa04637e1835be8bcbccf90677b3c8cf837085f132d6cfbfcc45f2efc8ec8c1dc794991fa06592d721337d25a30f5bd4c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testscenarios \
python3.13dist-testscenarios \
python313-testscenarios \
python3dist-testscenarios"

RDEPENDS:${PN} += "python-abi \
python313-testtools"

inherit rpm
