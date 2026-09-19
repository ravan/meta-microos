SUMMARY = "ClusterShell module for Python 3"
DESCRIPTION = "ClusterShell Python 3 module and related command line tools."
LICENSE = "LGPL-2.1-or-later"

PV = "1.10.1"

RPM_NAME = "python3-clustershell-1.10.1-1.1.noarch.rpm"
RPM_HASH = "0e5ed65eeca454fb623707b958c6e18716302959db54276b7f2794f52b9195e7630e4f17ac14890a612e921066e1fbd20e1bd337103ddb803b4a8670a461dcf6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-clustershell \
python3.13dist-clustershell \
python3dist-clustershell"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
python-abi \
python3-PyYAML"

inherit rpm
