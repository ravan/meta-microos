SUMMARY = "Sphinx Bootstrap Theme"
DESCRIPTION = "This Sphinx theme integrates the Bootstrap CSS / JavaScript framework \
with various layout options, hierarchical menu navigation, and \
mobile-friendly responsive design. It is configurable, extensible, and \
can use any number of different Bootswatch CSS themes."
LICENSE = "Apache-2.0 & MIT"

PV = "0.8.1"

RPM_NAME = "python314-sphinx-bootstrap-theme-0.8.1-3.5.noarch.rpm"
RPM_HASH = "84aa3ad5a95994f38fe7b1e8d1252edfaf044c9c540b009f2c7362df7cf348c3fc249a0f7404ea87dde0c27ae45afc7676449da63b4c1ff830d4ec0d3a41b0b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-bootstrap-theme \
python314-sphinx-bootstrap-theme \
python3dist-sphinx-bootstrap-theme"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
