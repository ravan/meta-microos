SUMMARY = "An HTML/XML generator"
DESCRIPTION = "This is MarkupPy - a Python module that for generating HTML/XML \
for Python programs."
LICENSE = "LicenseRef-SUSE-Public-Domain"

PV = "1.18"

RPM_NAME = "python313-MarkupPy-1.18-1.2.noarch.rpm"
RPM_HASH = "bd6f183f9daf0cb7f1d6d1d0eb8eea2c67068b49786af6a06f821d5205425beb3bf11c7698c2a59ab1c15262a0069f79658e2ea17fd01d3dd47a9a700d283334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-MarkupPy \
python3.13dist-markuppy \
python313-MarkupPy \
python3dist-markuppy"

RDEPENDS:${PN} += "python-abi"

inherit rpm
