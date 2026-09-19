SUMMARY = "Python utility for HTCondor"
DESCRIPTION = "PyCondor (Python HTCondor) is a tool to help build and submit workflows to HTCondor in a straight-forward manner with minimal hassle."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "python313-PyCondor-0.6.1-1.2.noarch.rpm"
RPM_HASH = "010bb38f52ac950cefa2b7c62cb75666f8ab45c03fbb05482da0360821cf99b83f7e6825cfd4e6e4559c34a951d9ef68af1a8177859d55cb4e9518f53a0763ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-PyCondor \
python3.13dist-pycondor \
python313-PyCondor \
python3dist-pycondor"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-click"

inherit rpm
