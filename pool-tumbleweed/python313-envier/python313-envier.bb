SUMMARY = "Python application configuration via the environment"
DESCRIPTION = "Envier is a Python library for extracting configuration from environment \
variables in a declarative and (eventually) 12-factor-app-compliant way."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python313-envier-0.6.1-2.7.noarch.rpm"
RPM_HASH = "fb0d0b04b4d6b5073f7c2a8c6a796534d7a391da84caf231e374764ec13b8302792376798dd5d6c88264e9e00c78d811eb29158c80ff645453f7411add290aca"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-envier \
python3.13dist-envier \
python313-envier \
python3dist-envier"

RDEPENDS:${PN} += "python-abi \
python313-mypy"

inherit rpm
