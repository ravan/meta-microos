SUMMARY = "Sphinx extension which renders display math in HTML via JavaScript"
DESCRIPTION = "sphinxcontrib-jsmath is a sphinx extension which renders display math in HTML \
via JavaScript."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "python313-sphinxcontrib-jsmath-1.0.1-6.2.noarch.rpm"
RPM_HASH = "a050a88303366e75f1b44f2543bc3c0f806eba35437298920e014e0f53e4007bf0b1bc05ead35438ed9f39e5eb688e2723639740cbc5cf3c1e10b60232bbc06c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-jsmath \
python3.13dist-sphinxcontrib-jsmath \
python313-sphinxcontrib-jsmath \
python3dist-sphinxcontrib-jsmath"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
