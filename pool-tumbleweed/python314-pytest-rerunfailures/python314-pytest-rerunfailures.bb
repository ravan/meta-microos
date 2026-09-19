SUMMARY = "A pytest plugin to re-run tests"
DESCRIPTION = "The pytest-rerunfailures package is a plugin for Pytest that re-runs \
tests to eliminate intermittent failures."
LICENSE = "MPL-2.0"

PV = "16.1"

RPM_NAME = "python314-pytest-rerunfailures-16.1-1.4.noarch.rpm"
RPM_HASH = "422a257ef2abf3382cfd7b6f124d98b6eeb429ad73f99411177b51688fb7b458c6628c435b3fcfb6312ce095ef28f153dd5afd5088dd956ebdf9cce0ff3d1967"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-rerunfailures \
python314-pytest-rerunfailures \
python3dist-pytest-rerunfailures"

RDEPENDS:${PN} += "python-abi \
python314-packaging \
python314-pytest"

inherit rpm
