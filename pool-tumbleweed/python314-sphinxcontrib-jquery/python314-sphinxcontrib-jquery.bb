SUMMARY = "Extension to include jQuery on newer Sphinx releases"
DESCRIPTION = "Extension to include jQuery on newer Sphinx releases"
LICENSE = "0BSD"

PV = "4.1"

RPM_NAME = "python314-sphinxcontrib-jquery-4.1-3.12.noarch.rpm"
RPM_HASH = "f8c3d6fd0188d4ce0af249cfa5dc94e49f03e67ff8b509923b629b6741b90d7702b647803873d84cea3b4e5c962e2ec0fbbc457f04b4adfe2cd7fe68eb46e870"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxcontrib-jquery \
python314-sphinxcontrib-jquery \
python3dist-sphinxcontrib-jquery"

RDEPENDS:${PN} += "python-abi \
python314-Sphinx"

inherit rpm
