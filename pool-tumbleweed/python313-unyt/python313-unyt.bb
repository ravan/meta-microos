SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python313-unyt-3.1.0-1.3.noarch.rpm"
RPM_HASH = "8822d1ac328bebc53439177aaea07edd916334bdb4c411343893695ba2b3034124e8484e078ce4e1b3f3ce728c640ae427052ce69f58d98adf8b90bedd9f365c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-unyt \
python3.13dist-unyt \
python313-unyt \
python3dist-unyt"

RDEPENDS:${PN} += "-python313-numpy >= 1.21.3 with python313-numpy < 3 \
python-abi \
python313-packaging \
python313-sympy"

inherit rpm
