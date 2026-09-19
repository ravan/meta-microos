SUMMARY = "Sphinx extension to support coroutines in markup"
DESCRIPTION = "Sphinx extension for adding asyncio-specific markups"
LICENSE = "Apache-2.0"

PV = "0.3.0"

RPM_NAME = "python314-sphinxcontrib-asyncio-0.3.0-4.5.noarch.rpm"
RPM_HASH = "43b6297dfcf013878debbc4560520a27ddc814eda2edd2ac474042ac1abf8e955ff9d2de705c72d104dbfa976d0acab802d1d60cd3b0b482ff63dc8d284e3e63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-asyncio \
python314-sphinxcontrib-asyncio \
python3dist-sphinxcontrib-asyncio"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
