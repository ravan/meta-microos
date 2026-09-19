SUMMARY = "Sphinx extension to support coroutines in markup"
DESCRIPTION = "Sphinx extension for adding asyncio-specific markups"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python313-sphinxcontrib-asyncio-0.3.0-4.5.noarch.rpm"
RPM_HASH = "3adee294413a6d0cc437d1d587bb55d16a6958347726e8f7f1a4168dec1a02e6b6bb6b3fec2f7e775a6f1e430ae49fd30e2418094ae65dd0c3fff5fec017ed00"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-asyncio \
python3.13dist-sphinxcontrib-asyncio \
python313-sphinxcontrib-asyncio \
python3dist-sphinxcontrib-asyncio"

RDEPENDS:${PN} += "python-abi \
python313-Sphinx"

inherit rpm
