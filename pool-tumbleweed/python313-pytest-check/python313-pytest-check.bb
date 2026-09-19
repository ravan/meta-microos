SUMMARY = "A pytest plugin that allows multiple failures per test"
DESCRIPTION = "A pytest plugin that allows multiple failures per test. A rewrite of pytest-expect"
LICENSE = "MIT"

PV = "2.8.0"

RPM_NAME = "python313-pytest-check-2.8.0-1.3.noarch.rpm"
RPM_HASH = "9f891bc65d1dedc04180073e6922cb0331e7b246bf7a885c71ecb3e3212aea5e6700e4c95324735ae9002961411892ff4621aceb94d99cc1f843b66fcede128a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-check \
python3.13dist-pytest-check \
python313-pytest-check \
python3dist-pytest-check"

RDEPENDS:${PN} += "python-abi \
python313-pytest"

inherit rpm
