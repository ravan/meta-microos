SUMMARY = "Sphinx extension which renders display math in HTML via JavaScript"
DESCRIPTION = "sphinxcontrib-jsmath is a sphinx extension which renders display math in HTML \
via JavaScript."
LICENSE = "BSD-2-Clause"

PV = "1.0.1"

RPM_NAME = "python314-sphinxcontrib-jsmath-1.0.1-6.2.noarch.rpm"
RPM_HASH = "ddd4755839d1138706f1ef8c4ff04d7fabcd0dabc1ce8e920edf99f38fa01cb7080f55497df6acebc4d809ce5ca65946cf8a2de15be2073b9f254d70c5327531"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-jsmath \
python314-sphinxcontrib-jsmath \
python3dist-sphinxcontrib-jsmath"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
