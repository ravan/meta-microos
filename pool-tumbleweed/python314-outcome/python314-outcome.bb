SUMMARY = "Function for capturing the outcome of Python function calls"
DESCRIPTION = "Outcome provides a function for capturing the outcome of a Python \
function call, so that it can be passed around."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.0.post0"

RPM_NAME = "python314-outcome-1.3.0.post0-2.5.noarch.rpm"
RPM_HASH = "861f962349248f3ec6fb4235d6a29762567fd430462fc1fcd467d8de34849578745003ef66ea4db24ff2ca880fde34a5db9778cb79df2686cf25bf249fcd0294"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-outcome \
python314-outcome \
python3dist-outcome"

RDEPENDS:${PN} += "python-abi \
python314-attrs"

inherit rpm
