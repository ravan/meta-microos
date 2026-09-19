SUMMARY = "Client library for DQSegDB"
DESCRIPTION = "python-dqsegdb provides the python bindings and the client tools to \
connect to LIGO/VIRGO DQSEGDB server instances."
LICENSE = "GPL-3.0-only"

PV = "2.1.0"

RPM_NAME = "python314-dqsegdb-2.1.0-1.7.noarch.rpm"
RPM_HASH = "5b62d305b61aceb7fc87dfef068f05f103583d0e1803753da52971129f60dbe4dbf582ffd5f5d4fe6222f1bbb49c0aea75f2b2d9db4e8be351fee3215e7e25b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-dqsegdb \
python314-dqsegdb \
python3dist-dqsegdb"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-gpstime \
python314-gwdatafind \
python314-lal \
python314-ligo-segments \
python314-lscsoft-glue \
python314-pyOpenSSL \
python314-pyRXP \
update-alternatives"

inherit rpm
