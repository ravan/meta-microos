SUMMARY = "A Python module to talk to a AVM fritzbox"
DESCRIPTION = "fritzconnection is a Python library to communicate with the AVM \
Fritz!Box by the TR-064 protocol. \
This allows to read status-informations from the box and to read \
and change configuration settings and state."
LICENSE = "MIT"

PV = "1.15.1"

RPM_NAME = "python313-fritzconnection-1.15.1-2.2.noarch.rpm"
RPM_HASH = "31f2fb0e8fbf2e76efb26444b187400fcaae2df2445dd50633536cd9dcbbb70340989b651d4807956284eff7abab4dd79d1a6980323c290857d6f77a09266bdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-fritzconnection \
python3.13dist-fritzconnection \
python313-fritzconnection \
python3dist-fritzconnection"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
alts \
python-abi \
python313-lxml \
python313-requests"

inherit rpm
