SUMMARY = "Sphinx Extension to enable OGP support"
DESCRIPTION = "Sphinx Extension to enable OGP support"
LICENSE = "MIT"

PV = "0.13.0"

RPM_NAME = "python314-sphinxext-opengraph-0.13.0-1.4.noarch.rpm"
RPM_HASH = "bf42d8f9582f9028b8b1b32302a55285b8a9f081102da2defada9b88b8846dd67bdc0a45d655a673cfc50a520febf5909d1586ba449ad8365f5ff705b77cc517"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-sphinxext-opengraph \
python314-sphinxext-opengraph \
python3dist-sphinxext-opengraph"

RDEPENDS:${PN} += "python-abi \
python3-Sphinx"

inherit rpm
