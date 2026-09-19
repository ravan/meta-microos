SUMMARY = "Simple pure-python AVM meta-data handling"
DESCRIPTION = "Simple pure-python AVM meta-data handling"
LICENSE = "MIT"

PV = "0.9.9"

RPM_NAME = "python313-pyavm-0.9.9-1.4.noarch.rpm"
RPM_HASH = "f0d8bfe6f4ece4f69a364faaad535083b4fa5c39feb096fdd21bdd20622a4be5cbe37e1a6d8981c8b4304c026d42175396b2aaa527f59995ec5ecbae7e2eb526"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyavm \
python3.13dist-pyavm \
python313-pyavm \
python3dist-pyavm"

RDEPENDS:${PN} += "python-abi"

inherit rpm
