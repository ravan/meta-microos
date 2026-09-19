SUMMARY = "Standard library aifc redistribution. 'dead battery'"
DESCRIPTION = "Standard library aifc redistribution. 'dead battery'."
LICENSE = "Python-2.0"

PV = "3.13.0"

RPM_NAME = "python313-standard-aifc-3.13.0-2.4.noarch.rpm"
RPM_HASH = "d35c50601ac2220d51e1b7f7f88a3dba916fd0f063d1666c2cc71f828403d4e3ab1fb52c2128a13a827a724e60fb23e85b4c6ffd0385540afa06d356d1a0aa79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-standard-aifc \
python3.13dist-standard-aifc \
python313-standard-aifc \
python3dist-standard-aifc"

RDEPENDS:${PN} += "python-abi \
python313-audioop-lts \
python313-standard-chunk"

inherit rpm
