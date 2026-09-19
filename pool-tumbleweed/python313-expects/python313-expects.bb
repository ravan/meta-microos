SUMMARY = "Expressive and extensible TDD/BDD assertion library for Python"
DESCRIPTION = "'Expects' is an expressive and extensible TDD/BDD assertion library for \
Python. Expects can be extended by defining new matchers."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python313-expects-0.9.0-3.5.noarch.rpm"
RPM_HASH = "7a93ec0651e081c3017cc91fe16489754924f78805335c26c6406feec901dd12441fc1ee99e00df9c1e847f0a4680a65cd482eb20661462ae2151e2d8a75c785"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-expects \
python3.13dist-expects \
python313-expects \
python3dist-expects"

RDEPENDS:${PN} += "python-abi"

inherit rpm
