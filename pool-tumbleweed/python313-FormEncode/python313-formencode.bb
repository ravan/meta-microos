SUMMARY = "HTML form validation, generation, and conversion package"
DESCRIPTION = "FormEncode validates and converts nested structures. It allows for \
a declarative form of defining the validation, and decoupled processes \
for filling and generating forms."
LICENSE = "Python-2.0"

PV = "2.1.1"

RPM_NAME = "python313-FormEncode-2.1.1-1.5.noarch.rpm"
RPM_HASH = "0324cde35bffa0cbec8c5b287fc1b86d695d85fbf51cc6d9e15e68c379955e03930535bd56ca57707ba4efb05a4c8d6be8226956fe2df5d4d3a8cd09285f80a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-FormEncode \
python3.13dist-formencode \
python313-FormEncode \
python3dist-formencode"

RDEPENDS:${PN} += "python-abi"

inherit rpm
