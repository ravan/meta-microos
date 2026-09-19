SUMMARY = "A Python utility / library to sort Python imports"
DESCRIPTION = "isort your python imports for you so you don't have to. \
 \
isort is a Python utility / library to sort imports alphabetically, and \
automatically separated into sections and by type. It provides a command line \
utility, Python library and plugins for various editors to quickly sort all your \
imports. It requires Python 3.9+ to run but supports formatting Python 2 code \
too."
LICENSE = "MIT"

PV = "8.0.1"

RPM_NAME = "python314-isort-8.0.1-2.4.noarch.rpm"
RPM_HASH = "10b0376e4fa0101be54368d9e9682fbc22b4f7b16564b635a6fd97c561a7f1062c6a00a1d057e71d2c082c7fd79c4d23c378f0242b4e24aeab1365930cde8c34"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-isort \
python314-isort \
python3dist-isort"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
