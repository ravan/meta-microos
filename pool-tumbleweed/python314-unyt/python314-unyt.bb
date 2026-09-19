SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "3.1.0"

RPM_NAME = "python314-unyt-3.1.0-1.3.noarch.rpm"
RPM_HASH = "cc957f8eedc5f56df0cbef47f870582d6c35abed20de7ad936613e752e6a0e7387692431672d72c236e84c114ae09c61a69049422912b6b0068495d66ed27fc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-unyt \
python314-unyt \
python3dist-unyt"

RDEPENDS:${PN} += "-python314-numpy >= 1.21.3 with python314-numpy < 3 \
python-abi \
python314-packaging \
python314-sympy"

inherit rpm
