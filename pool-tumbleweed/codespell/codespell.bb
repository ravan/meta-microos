SUMMARY = "Source code checker for common misspellings"
DESCRIPTION = "codespell fixes common misspellings in text files. It primarily checks \
misspelled words in source code, but it can be used with other files as well."
LICENSE = "GPL-2.0-only"

PV = "2.4.3"

RPM_NAME = "codespell-2.4.3-1.1.noarch.rpm"
RPM_HASH = "62ead68afef11fc3436a8508f79242c7b12c2efdd7cc1da449c4ab44cb1d68fc4f1b4efc89b01763f037099f1d1a8b847a7b9700022c9b5c7666eb627b2ef591"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "codespell \
python3.13dist-codespell \
python3dist-codespell"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-chardet \
python3-setuptools"

inherit rpm
