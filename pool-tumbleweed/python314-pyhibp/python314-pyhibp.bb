SUMMARY = "An interface to Troy Hunt's 'Have I Been Pwned' public API"
DESCRIPTION = "A Python interface to Troy Hunt's 'Have I Been Pwned?' (HIBP) public API."
LICENSE = "AGPL-3.0-or-later"

PV = "4.2.0"

RPM_NAME = "python314-pyhibp-4.2.0-2.5.noarch.rpm"
RPM_HASH = "f08c9ebb734402da4073aadd3c37de69f0553cb645f2541e02c5c4851006e72eb635f094bf92531424f27271f5f6e31ab39088a722daffecdcd7993ea990f988"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyhibp \
python314-pyhibp \
python3dist-pyhibp"

RDEPENDS:${PN} += "python-abi \
python314-requests"

inherit rpm
