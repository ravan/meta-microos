SUMMARY = "Python package for querying metadatdata from sdists/bdists/installed packages"
DESCRIPTION = "This package provides an API for querying the distutils metadata written in \
the PKG-INFO file inside a source distriubtion (an sdist) or a \
binary distribution (e.g., created by running bdist_egg).  It can \
also query the EGG-INFO directory of an installed distribution, and \
the *.egg-info stored in a 'development checkout' \
(e.g, created by running setup.py develop)."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "python314-pkginfo-1.13-1.1.noarch.rpm"
RPM_HASH = "2e2d169e28e65bf0e2887dcb69ffb265abed5dfcbdc4fbd5020be5339407a246a3b6d281a345608fbb5b09da885946fe438823992b68e85dad8c2aba67f7dada"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pkginfo \
python314-pkginfo \
python3dist-pkginfo"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
