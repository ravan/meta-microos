SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "python312-unyt-3.0.4-1.1.noarch.rpm"
RPM_HASH = "3cdbc3ff43c99e0ffa79581a8e1c8921340f1838c1f9c08fde140047cca0ee0983370d0ea9dce1f5d9de34201b8623d3404ed9102c5b1b1801fd33d5f680d71c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.12dist-unyt \
python312-unyt \
python3dist-unyt"

RDEPENDS:${PN} += "-python312-numpy >= 1.19.3 with python312-numpy < 3 \
python-abi \
python312-packaging \
python312-sympy"

inherit rpm
