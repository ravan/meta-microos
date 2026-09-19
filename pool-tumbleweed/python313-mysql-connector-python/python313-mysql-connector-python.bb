SUMMARY = "MySQL driver written in Python"
DESCRIPTION = "MySQL driver written in Python which does not depend on MySQL C client libraries and implements the DB API v2.0 specification (PEP-249)."
LICENSE = "SUSE-GPL-2.0-with-FLOSS-exception"

PV = "9.7.0"

RPM_NAME = "python313-mysql-connector-python-9.7.0-1.2.aarch64.rpm"
RPM_HASH = "fb85c6fe5fb86cf23d0799a42ccb2985a9e5304ccb0550c3011bc62268f87e447d719d6cef869d3b7abd618143c0fa8ff3862715bc2abfe1d96913d24b075686"

RPROVIDES:${PN} += "python3-mysql-connector-python \
python3.13dist-mysql-connector-python \
python3.13dist-mysqlx-connector-python \
python313-mysql-connector-python \
python3dist-mysql-connector-python \
python3dist-mysqlx-connector-python"

RDEPENDS:${PN} += "python-abi \
python313-dnspython \
python313-protobuf"

inherit rpm
