SUMMARY = "Python module to mock and replay HTTP interactions"
DESCRIPTION = "This module records a test suite's HTTP interactions and replays them during future \
test runs for deterministic tests. \
 \
This is a Python version of Ruby's VCR library."
LICENSE = "MIT"

PV = "8.1.1"

RPM_NAME = "python314-vcrpy-8.1.1-3.2.noarch.rpm"
RPM_HASH = "a430511ff4507d61ce7d0ca2a953315f872cec2209a460112f492808c4bd3578a2b3c99d02db6c645d0e14f7e35cff4045bc66e5b4bf0ce3d2134b87e2547898"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-vcrpy \
python314-vcrpy \
python3dist-vcrpy"

RDEPENDS:${PN} += "python-abi \
python314-PyYAML \
python314-wrapt"

inherit rpm
