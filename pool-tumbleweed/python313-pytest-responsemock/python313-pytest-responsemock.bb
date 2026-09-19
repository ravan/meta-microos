SUMMARY = "Simplified requests calls mocking for pytest"
DESCRIPTION = "Simplified requests calls mocking for pytest."
LICENSE = "BSD-3-Clause"

PV = "1.1.1"

RPM_NAME = "python313-pytest-responsemock-1.1.1-2.5.noarch.rpm"
RPM_HASH = "47be740e8ad18723d6189363565edd8882b5950b55040759ccbe78d5dac98c4191f4c1232d49165c3742c8f18376fd74931147b47f771caeff856d1240270f93"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-responsemock \
python3.13dist-pytest-responsemock \
python313-pytest-responsemock \
python3dist-pytest-responsemock"

RDEPENDS:${PN} += "python-abi \
python313-pytest \
python313-responses"

inherit rpm
