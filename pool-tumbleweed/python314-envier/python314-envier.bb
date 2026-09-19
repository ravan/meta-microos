SUMMARY = "Python application configuration via the environment"
DESCRIPTION = "Envier is a Python library for extracting configuration from environment \
variables in a declarative and (eventually) 12-factor-app-compliant way."
LICENSE = "BSD-3-Clause"

PV = "0.6.1"

RPM_NAME = "python314-envier-0.6.1-2.7.noarch.rpm"
RPM_HASH = "c50a49ac5a6edac14aea3bd3e15c7ab1010a40f8a9919cfc4731315c8d9c8b43f152abfd0073feb92840cfd35e9e848d2c9a05c4c8c8ff1f50b86c68af46cfae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-envier \
python314-envier \
python3dist-envier"

RDEPENDS:${PN} += "python-abi \
python314-mypy"

inherit rpm
