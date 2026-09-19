SUMMARY = "Expressive and extensible TDD/BDD assertion library for Python"
DESCRIPTION = "'Expects' is an expressive and extensible TDD/BDD assertion library for \
Python. Expects can be extended by defining new matchers."
LICENSE = "Apache-2.0"

PV = "0.9.0"

RPM_NAME = "python314-expects-0.9.0-3.5.noarch.rpm"
RPM_HASH = "254dd0db30985d062aeae4d75aff2813519058c6472402223f96c9ab2bd7f682b6662587674a5ace6ab3c07379c141f35df5be2f67f5cb48c41e46579962b7d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-expects \
python314-expects \
python3dist-expects"

RDEPENDS:${PN} += "python-abi"

inherit rpm
