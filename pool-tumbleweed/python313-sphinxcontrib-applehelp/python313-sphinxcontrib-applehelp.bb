SUMMARY = "Sphinx extension which outputs Apple help books"
DESCRIPTION = "sphinxcontrib-applehelp is a sphinx extension which outputs Apple help books"
LICENSE = "BSD-2-Clause"

PV = "2.0.0"

RPM_NAME = "python313-sphinxcontrib-applehelp-2.0.0-1.9.noarch.rpm"
RPM_HASH = "6d87a9ca827894f715b0aee4e1952e9f5cd50eddce0bc38a58eee0c8f3b0eb7f4f05b8671e45c2c40c2d3bd8876f8ebccdc16f595fab0d3d1f19245c2dc2ddba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-sphinxcontrib-applehelp \
python3.13dist-sphinxcontrib-applehelp \
python313-sphinxcontrib-applehelp \
python3dist-sphinxcontrib-applehelp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
