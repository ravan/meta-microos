SUMMARY = "A pyunit extension for dependency injection"
DESCRIPTION = "testscenarios provides clean dependency injection for Python unittest style \
tests. This can be used for interface testing (testing many implementations via \
a single test suite) or for classic dependency injection (provide tests with \
dependencies externally to the test code itself, allowing easy testing in \
different situations)."
LICENSE = "Apache-2.0 | BSD-3-Clause"

PV = "0.6.2"

RPM_NAME = "python314-testscenarios-0.6.2-1.3.noarch.rpm"
RPM_HASH = "e63b4d4ab1d52d2107bab7df1b454ec1a56e885911a4f82c3b2f3a7f87967a16e023f9ea5becd6ba503c31fe8e595ed3ccec9a7cfb2d79f32d9cbbbdfabfaefe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-testscenarios \
python314-testscenarios \
python3dist-testscenarios"

RDEPENDS:${PN} += "python-abi \
python314-testtools"

inherit rpm
