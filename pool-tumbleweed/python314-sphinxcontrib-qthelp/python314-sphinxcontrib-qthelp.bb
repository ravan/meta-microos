SUMMARY = "Sphinx extension which outputs QtHelp"
DESCRIPTION = "sphinxcontrib-qthelp is a sphinx extension which outputs QtHelp document."
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python314-sphinxcontrib-qthelp-2.0.0-1.7.noarch.rpm"
RPM_HASH = "0bc7b9bea98ea99d9ac1599161dbd20c345c8e333d345bd973b7a727f5f7e661547cbfa9f3326228d35080313251b31c6156e809baac732f8d05caad441a9694"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-qthelp \
python314-sphinxcontrib-qthelp \
python3dist-sphinxcontrib-qthelp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
