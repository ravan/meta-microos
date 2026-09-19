SUMMARY = "Sphinx extension to build a 404 page with absolute URLs"
DESCRIPTION = "Create a custom 404 page with absolute URLs hardcoded. \
 \
Check out the full documentation at https://sphinx-notfound-page.readthedocs.io/"
LICENSE = "MIT"

PV = "1.1.0"

RPM_NAME = "python314-sphinx-notfound-page-1.1.0-2.2.noarch.rpm"
RPM_HASH = "1e3fc5890a8ff3144d0ff09293be0e5c2f813d91a580820dd25d84d41c48093a2dff0b944f2fc6305dfb638afed1a5bbb079c1dc9f9c9dc05625a7180d30d284"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinx-notfound-page \
python314-sphinx-notfound-page \
python3dist-sphinx-notfound-page"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
