SUMMARY = "Client library for the LIGO Data Replicator (LDR) service"
DESCRIPTION = "The client library for the LIGO Data Replicator (LDR) service. \
 \
The DataFind service allows users to query for the location of \
Gravitational-Wave Frame (GWF) files containing data from the current \
gravitational-wave detectors"
LICENSE = "GPL-3.0-only"

PV = "2.1.1"

RPM_NAME = "python313-gwdatafind-2.1.1-1.2.noarch.rpm"
RPM_HASH = "b32bd5f3444d094b26d7d174126477d2eefabc1f1540bd6d952bf2ee7f7a704040a6a736fece4a6f6f817ae9a1b7130ff60c295835a5281bf52151bb2e31cca3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-gwdatafind \
python3.13dist-gwdatafind \
python313-gwdatafind \
python3dist-gwdatafind"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-igwn-auth-utils \
python313-igwn-segments \
update-alternatives"

inherit rpm
