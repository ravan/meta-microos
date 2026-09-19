SUMMARY = "Python module to mock and replay HTTP interactions"
DESCRIPTION = "This module records a test suite's HTTP interactions and replays them during future \
test runs for deterministic tests. \
 \
This is a Python version of Ruby's VCR library."
LICENSE = "MIT"

PV = "8.1.1"

RPM_NAME = "python313-vcrpy-8.1.1-3.2.noarch.rpm"
RPM_HASH = "1e9489cdbd4ab47a6577d19eaf98ee75962b98c0dda4ca49999aa8cf9b5d37692981a4dbeb46f8192fef564a158f493c6a183904935d12d6dcbfb07a2104d6b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-vcrpy \
python3.13dist-vcrpy \
python313-vcrpy \
python3dist-vcrpy"

RDEPENDS:${PN} += "python-abi \
python313-PyYAML \
python313-wrapt"

inherit rpm
