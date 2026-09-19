SUMMARY = "Sphinx 'blockdiag' extension"
DESCRIPTION = "A sphinx extension for embedding block diagram using blockdiag."
LICENSE = "BSD-2-Clause"

PV = "3.0.0"

RPM_NAME = "python313-sphinxcontrib-blockdiag-3.0.0-4.5.noarch.rpm"
RPM_HASH = "8a52ea6c49609c581ddd1a246d459d1cbef0aba45a39921bf0301d00a4d6ef4a12936a9f1cc638a1ac1423df04374a703beaa663d7a2959ab3bc8f7e33002b2e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-blockdiag \
python3.13dist-sphinxcontrib-blockdiag \
python313-sphinxcontrib-blockdiag \
python3dist-sphinxcontrib-blockdiag"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx \
python313-blockdiag"

inherit rpm
