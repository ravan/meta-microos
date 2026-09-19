SUMMARY = "Python package to work with Document Object Identifier (doi)"
DESCRIPTION = "Python package to work with Document Object Identifier (doi)"
LICENSE = "GPL-3.0-only"

PV = "0.2.0"

RPM_NAME = "python313-python-doi-0.2.0-1.16.noarch.rpm"
RPM_HASH = "75c26ea407d5985a825ab1c7df69ce5f0a9082561c20684f6a2229d7e458fb4a416e9089482d9800031d508dcb5693d288d16a244cddba37ebb1255f90363145"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-doi \
python3.13dist-python-doi \
python313-python-doi \
python3dist-python-doi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
