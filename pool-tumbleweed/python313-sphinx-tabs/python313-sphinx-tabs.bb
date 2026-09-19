SUMMARY = "Tabbed views for Sphinx"
DESCRIPTION = "Create tabbed content in Sphinx documentation when building HTML."
LICENSE = "MIT"

PV = "3.4.7"

RPM_NAME = "python313-sphinx-tabs-3.4.7-3.4.noarch.rpm"
RPM_HASH = "fe679ba8e381e8b547f795e0696e5f7100a959e8ba587b0a9636412be9be7e7f6328a240db0d05866dd0420d5fb93a09ca39b1bc253fc67501276f46a652f0aa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinx-tabs \
python3.13dist-sphinx-tabs \
python313-sphinx-tabs \
python3dist-sphinx-tabs"

RDEPENDS:${PN} += "python-abi \
python313-Pygments \
python313-Sphinx \
python313-docutils"

inherit rpm
