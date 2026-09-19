SUMMARY = "Client library for the LIGO Data Replicator (LDR) service"
DESCRIPTION = "The client library for the LIGO Data Replicator (LDR) service. \
 \
The DataFind service allows users to query for the location of \
Gravitational-Wave Frame (GWF) files containing data from the current \
gravitational-wave detectors"
LICENSE = "GPL-3.0-only"

PV = "2.1.1"

RPM_NAME = "python314-gwdatafind-2.1.1-1.2.noarch.rpm"
RPM_HASH = "407cad4b51338c00e666bd0ddc6c6608d23d60e1dc306b95e4607565bac2e479bec40be2a2ba32e09a7582d86c36f0e8a1f5f0dd0e348a45a43f973605c2102a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-gwdatafind \
python314-gwdatafind \
python3dist-gwdatafind"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-igwn-auth-utils \
python314-igwn-segments \
update-alternatives"

inherit rpm
