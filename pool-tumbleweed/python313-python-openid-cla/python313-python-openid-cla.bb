SUMMARY = "CLA extension for python-openid"
DESCRIPTION = "CLA extension implementation for python-openid."
LICENSE = "BSD-3-Clause"

PV = "1.2"

RPM_NAME = "python313-python-openid-cla-1.2-2.5.noarch.rpm"
RPM_HASH = "db83bf06ac5dc88d64a7d26699bc05668d80009339c32aeb148c39a8ab934345bb663559190816e70209f5cb8fe1974b53691353dcb0b4094caa4e6cbf81810d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-python-openid-cla \
python3.13dist-python-openid-cla \
python313-python-openid-cla \
python3dist-python-openid-cla"

RDEPENDS:${PN} += "python-abi \
python313-python3-openid"

inherit rpm
