SUMMARY = "A pytest plugin for testing Jupyter libraries and extensions"
DESCRIPTION = "A pytest plugin for testing Jupyter libraries and extensions."
LICENSE = "BSD-3-Clause & MIT"

PV = "0.11.0"

RPM_NAME = "python314-pytest-jupyter-0.11.0-1.5.noarch.rpm"
RPM_HASH = "d862999d51a39f9e41729099eb971e6310f14514c83f95a00d31393b630e3cf9aa418e4757037867ff4ca33d8b712246d267ceca3a29998f84f528528c84edce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pytest-jupyter \
python314-pytest-jupyter \
python3dist-pytest-jupyter"

RDEPENDS:${PN} += "python-abi \
python314-jupyter-core \
python314-pytest"

inherit rpm
