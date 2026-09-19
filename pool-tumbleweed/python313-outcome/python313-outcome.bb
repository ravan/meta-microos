SUMMARY = "Function for capturing the outcome of Python function calls"
DESCRIPTION = "Outcome provides a function for capturing the outcome of a Python \
function call, so that it can be passed around."
LICENSE = "Apache-2.0 | MIT"

PV = "1.3.0.post0"

RPM_NAME = "python313-outcome-1.3.0.post0-2.5.noarch.rpm"
RPM_HASH = "e142866b1bf756a0fead9f478d5b6bb47d3d64fab3d18fd7b1f73992e2c9112ee97e7f5e72aa0adc2e592340595a18af4a6a5f673f7c232da719668f49b81deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-outcome \
python3.13dist-outcome \
python313-outcome \
python3dist-outcome"

RDEPENDS:${PN} += "python-abi \
python313-attrs"

inherit rpm
