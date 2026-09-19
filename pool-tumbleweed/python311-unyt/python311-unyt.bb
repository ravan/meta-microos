SUMMARY = "A package for handling numpy arrays with units"
DESCRIPTION = "A package for handling numpy arrays with units. \
 \
Often writing code that deals with data that has units can be confusing. A \
function might return an array but at least with plain NumPy arrays, there is no \
way to easily tell what the units of the data are without somehow knowing *a \
priori*."
LICENSE = "BSD-3-Clause"

PV = "3.0.4"

RPM_NAME = "python311-unyt-3.0.4-1.1.noarch.rpm"
RPM_HASH = "c4eb2a57075539717fc7919dfa877ee5869fe455dca5abde947d18b2780a33f76338120bdbbffc45687c9c96470e4c0caf8a6ca4fc10b42f28dfd5a0f113902f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-unyt \
python311-unyt \
python3dist-unyt"

RDEPENDS:${PN} += "-python311-numpy >= 1.19.3 with python311-numpy < 3 \
python-abi \
python311-packaging \
python311-sympy"

inherit rpm
