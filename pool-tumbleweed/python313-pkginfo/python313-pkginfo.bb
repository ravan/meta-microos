SUMMARY = "Python package for querying metadatdata from sdists/bdists/installed packages"
DESCRIPTION = "This package provides an API for querying the distutils metadata written in \
the PKG-INFO file inside a source distriubtion (an sdist) or a \
binary distribution (e.g., created by running bdist_egg).  It can \
also query the EGG-INFO directory of an installed distribution, and \
the *.egg-info stored in a 'development checkout' \
(e.g, created by running setup.py develop)."
LICENSE = "MIT"

PV = "1.13"

RPM_NAME = "python313-pkginfo-1.13-1.1.noarch.rpm"
RPM_HASH = "c0334ed5d01bb32e03fc359d32bca17d0e4b0003b1938e4875797a6a1b48be5dd12daf98dfa4cdc8119c2f5c73a754cd233e84cd456e710cc53272c3348012b8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pkginfo \
python3.13dist-pkginfo \
python313-pkginfo \
python3dist-pkginfo"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi"

inherit rpm
