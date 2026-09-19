SUMMARY = "Extensions to the Python Standard Library Unit Testing Framework"
DESCRIPTION = "testtools is a set of extensions to the Python standard library's unit tests \
framework. These extensions have been derived from many years of experience \
with unit tests in Python and come from many different sources. testtools \
gives you the very latest in unit testing technology in a way that will \
work with Python 3.10+ and PyPy3."
LICENSE = "MIT"

PV = "2.9.1"

RPM_NAME = "python313-testtools-2.9.1-1.3.noarch.rpm"
RPM_HASH = "8fb167109fef29fc33d90ceba0ce3784cc65e3858cf0bc5e74ddc85334883cdf557bfd88741b6b9cb1658f42fb0c54cc22b63757d45b1965d620c1812410aad0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testtools \
python3.13dist-testtools \
python313-testtools \
python3dist-testtools"

RDEPENDS:${PN} += "python-abi \
python313-Twisted"

inherit rpm
