SUMMARY = "MySQL driver written in Python"
DESCRIPTION = "MySQL driver written in Python which does not depend on MySQL C client libraries and implements the DB API v2.0 specification (PEP-249)."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "9.7.0"

RPM_NAME = "python314-mysql-connector-python-9.7.0-1.2.aarch64.rpm"
RPM_HASH = "585aa754ff0884652e777d9c3e15ea6df9795a81fe7faa2ae7fb6a57d38ab8db4c69b22799bda5e028189141239dc0891ef597e00dc3e3455eec31df0d4d8838"

RPROVIDES:${PN} += "python3.14dist-mysql-connector-python \
python3.14dist-mysqlx-connector-python \
python314-mysql-connector-python \
python3dist-mysql-connector-python \
python3dist-mysqlx-connector-python"

RDEPENDS:${PN} += "python-abi \
python314-dnspython \
python314-protobuf"

inherit rpm
