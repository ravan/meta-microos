SUMMARY = "Pip requirements parsing library"
DESCRIPTION = "A mostly correct pip requirements parsing library because it uses pip's own code."
LICENSE = "MIT"

PV = "32.0.1"

RPM_NAME = "python313-pip-requirements-parser-32.0.1-2.4.noarch.rpm"
RPM_HASH = "fc1eaf964b7bf006f5e0496fabf435a80b38fa9e36729bbe3dd392193bc84f08508b6c4c61b3fe3209ce02bd8c44040318a95b4d7bfe74c1f4cc7925d8de3f86"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pip-requirements-parser \
python3.13dist-pip-requirements-parser \
python313-pip-requirements-parser \
python3dist-pip-requirements-parser"

RDEPENDS:${PN} += "python-abi \
python313-packaging \
python313-pyparsing"

inherit rpm
