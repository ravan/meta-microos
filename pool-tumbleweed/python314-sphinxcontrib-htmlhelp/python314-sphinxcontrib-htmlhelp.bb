SUMMARY = "Sphinx extension to generate HTML help files"
DESCRIPTION = "sphinxcontrib-htmlhelp is a sphinx extension which renders HTML help files."
LICENSE = "BSD-2-Clause"

PV = "2.1.0"

RPM_NAME = "python314-sphinxcontrib-htmlhelp-2.1.0-2.2.noarch.rpm"
RPM_HASH = "89e8718cbe81797c0bb9979e071b08f7bdd6a7df1fa91163f9285ed0272cd5d6371d16c0e4b44142d2fa49706f38ca6265c5947a461ed428175838e0f6a80a6e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-htmlhelp \
python314-sphinxcontrib-htmlhelp \
python3dist-sphinxcontrib-htmlhelp"

RDEPENDS:${PN} += "python-abi"

inherit rpm
