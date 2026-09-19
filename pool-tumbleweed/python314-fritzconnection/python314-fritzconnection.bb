SUMMARY = "A Python module to talk to a AVM fritzbox"
DESCRIPTION = "fritzconnection is a Python library to communicate with the AVM \
Fritz!Box by the TR-064 protocol. \
This allows to read status-informations from the box and to read \
and change configuration settings and state."
LICENSE = "MIT"

PV = "1.15.1"

RPM_NAME = "python314-fritzconnection-1.15.1-2.2.noarch.rpm"
RPM_HASH = "3f9dca440024a1e9fadb735244bea7e7c01dc1213b1d701109efe927a202fc68e6d1899cce4a6846714797b3aa80c815069c056295de8d4ac801ce9667b27f02"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-fritzconnection \
python314-fritzconnection \
python3dist-fritzconnection"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
alts \
python-abi \
python314-lxml \
python314-requests"

inherit rpm
