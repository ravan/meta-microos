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

RPM_NAME = "python313-isort-8.0.1-2.4.noarch.rpm"
RPM_HASH = "c24db36727b867539b652257733de28411a2bc7731b1db4683d3787336f86d86275868ca806fb8713f715c85fbb3504c1cc1ac73b821e1e031e0cecc570989ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-isort \
python3.13dist-isort \
python313-isort \
python3dist-isort"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
