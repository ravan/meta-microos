SUMMARY = "Spyder extensions for the python-language-server"
DESCRIPTION = "Spyder extensions for the python-lsp-server"
LICENSE = "MIT"

PV = "0.4.0"

RPM_NAME = "python313-pyls-spyder-0.4.0-2.5.noarch.rpm"
RPM_HASH = "222bfe138be150eb501f0895545c963732ad9bf8cc379df9dc244fd4a94c1382c08082708b13354581c4caeed0e345636574bf15160d843bbae0b4ee3a432da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyls-spyder \
python3.13dist-pyls-spyder \
python313-pyls-spyder \
python3dist-pyls-spyder"

RDEPENDS:${PN} += "python-abi \
python313-python-lsp-server"

inherit rpm
