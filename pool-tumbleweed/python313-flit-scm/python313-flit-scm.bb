SUMMARY = "PEP 518 build backend using setuptools_scm and flit"
DESCRIPTION = "A PEP 518 build backend that uses setuptools_scm to generate a version file \
from your version control system, then flit to build the package."
LICENSE = "MIT"

PV = "1.7.0"

RPM_NAME = "python313-flit-scm-1.7.0-2.15.noarch.rpm"
RPM_HASH = "ee1ede03bba69b06241e255ac16ef9b64e2c649cc443a047612886f10936bc58447b6d6d0dd0780c80a0a540631bd669808527f1f82ad6285a87531de6dc7dc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-flit-scm \
python3.13dist-flit-scm \
python313-flit-scm \
python3dist-flit-scm"

RDEPENDS:${PN} += "python-abi \
python313-flit-core \
python313-setuptools-scm"

inherit rpm
