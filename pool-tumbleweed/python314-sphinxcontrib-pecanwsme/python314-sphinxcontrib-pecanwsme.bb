SUMMARY = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
DESCRIPTION = "Extension to Sphinx for documenting APIs built with Pecan and WSME"
LICENSE = "Apache-2.0"

PV = "0.11.0"

RPM_NAME = "python314-sphinxcontrib-pecanwsme-0.11.0-2.5.noarch.rpm"
RPM_HASH = "a4ff5831a05e54c104d5c0f70a052e1b676a21a268f674adbccbd83c8fe0f5666cbfe80c2567222afc50f1e523157ad8db7b2f2843b5ed4a074a335a12590334"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-pecanwsme \
python314-sphinxcontrib-pecanwsme \
python3dist-sphinxcontrib-pecanwsme"

RDEPENDS:${PN} += "python-abi \
python314-sphinxcontrib-httpdomain"

inherit rpm
