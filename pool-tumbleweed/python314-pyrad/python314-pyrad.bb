SUMMARY = "RADIUS tools"
DESCRIPTION = "pyrad is an implementation of a RADIUS client/server as described in RFC2865. \
It takes care of all the details like building RADIUS packets, sending \
them and decoding responses."
LICENSE = "BSD-3-Clause"

PV = "2.5.4"

RPM_NAME = "python314-pyrad-2.5.4-1.4.noarch.rpm"
RPM_HASH = "2b417f49c13aed76196839f0589a4327ce3bb21ad483c29488ccd02eefc335ecd5c21638e0d97e6dac7af628293d859eb090ccbed99f761893f93dc33f2cad50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-pyrad \
python314-pyrad \
python3dist-pyrad"

RDEPENDS:${PN} += "python-abi \
python314-netaddr"

inherit rpm
