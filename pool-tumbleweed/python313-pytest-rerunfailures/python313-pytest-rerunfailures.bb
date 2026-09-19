SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "16.1"

RPM_NAME = "python313-pytest-rerunfailures-16.1-1.4.noarch.rpm"
RPM_HASH = "e4c17dbc9a997c21c78f6ae2045d4fe052ff666963a56483efd9165a10c7cbea6ca42dafde9d7eedf56a6f5227a8d07e54b6084b4757bc55ffba839a943e6825"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-rerunfailures \
python3.13dist-pytest-rerunfailures \
python313-pytest-rerunfailures \
python3dist-pytest-rerunfailures"

RDEPENDS:${PN} += "python-abi \
python313-packaging \
python313-pytest"

inherit rpm
