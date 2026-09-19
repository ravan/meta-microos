SUMMARY = "Client library for DQSegDB"
DESCRIPTION = "python-dqsegdb provides the python bindings and the client tools to \
connect to LIGO/VIRGO DQSEGDB server instances."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "python313-dqsegdb-2.1.0-1.7.noarch.rpm"
RPM_HASH = "945c7db8556a6e25be5e636bd0865380382c6ce48a875026a3810e73c2edea600aa1eb0678399c74d42ae3811e7a34744993f5d6e709f2f82acf30747c041634"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-dqsegdb \
python3.13dist-dqsegdb \
python313-dqsegdb \
python3dist-dqsegdb"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-gpstime \
python313-gwdatafind \
python313-lal \
python313-ligo-segments \
python313-lscsoft-glue \
python313-pyOpenSSL \
python313-pyRXP \
update-alternatives"

inherit rpm
