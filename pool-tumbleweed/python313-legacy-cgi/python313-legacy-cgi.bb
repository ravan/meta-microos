SUMMARY = "Fork of the standard library cgi and cgitb modules"
DESCRIPTION = "This is a fork of the standard library modules ``cgi`` and ``cgitb``. \
They are slated to be removed from the Python standard libary in \
Python 3.13 by PEP-594_."
LICENSE = "Python-2.0"

PV = "2.6.4"

RPM_NAME = "python313-legacy-cgi-2.6.4-1.5.noarch.rpm"
RPM_HASH = "8584408feae4b5c94b5bbc9c2df84f88b372ca8063c408c64740fe98683e36b309acd124f0402acbc2519a5b8b98446a1c57ca50e91f67e71a846c0b3c0cf8ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-legacy-cgi \
python3.13dist-legacy-cgi \
python313-legacy-cgi \
python3dist-legacy-cgi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
