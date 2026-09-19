SUMMARY = "A port of node.js's EventEmitter to python"
DESCRIPTION = "pyee supplies an ``EventEmitter`` object similar to the ``EventEmitter`` \
from Node.js."
LICENSE = "MIT"

PV = "13.0.1"

RPM_NAME = "python313-pyee-13.0.1-1.4.noarch.rpm"
RPM_HASH = "95ff5bce42c1fde52a4a9809565d0078f959cbcfa04481863f4552959c5397c58755b9e66222f2b3afb1cbc3c900ccb59f15106b54c37111475eec5da73e48fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyee \
python3.13dist-pyee \
python313-pyee \
python3dist-pyee"

RDEPENDS:${PN} += "python-abi \
python313-typing-extensions"

inherit rpm
