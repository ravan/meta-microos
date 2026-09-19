SUMMARY = "Fork of the standard library cgi and cgitb modules"
DESCRIPTION = "This is a fork of the standard library modules ``cgi`` and ``cgitb``. \
They are slated to be removed from the Python standard libary in \
Python 3.13 by PEP-594_."
LICENSE = "Python-2.0"

PV = "2.6.4"

RPM_NAME = "python314-legacy-cgi-2.6.4-1.5.noarch.rpm"
RPM_HASH = "37c1d25df43d40666dc8c98ef24aa39d78c37f9bee82756741e5fb4dafce36fa3ce60b2e0a49964de0c017d8252235b0ae970650df0227c51dc7b87217aaf31f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-legacy-cgi \
python314-legacy-cgi \
python3dist-legacy-cgi"

RDEPENDS:${PN} += "python-abi"

inherit rpm
