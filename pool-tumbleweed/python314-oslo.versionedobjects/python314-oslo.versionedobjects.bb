SUMMARY = "Oslo Versioned Objects library"
DESCRIPTION = "oslo.versionedobjects library deals with DB schema being at different versions \
than the code expects, allowing services to be operated safely during upgrades. \
It enables DB independent schema by providing an abstraction layer, which \
allows us to support SQL and NoSQL Databases. oslo.versionedobjects is also \
used in RPC APIs, to ensure upgrades happen without spreading version dependent \
code across different services and projects."
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "python314-oslo.versionedobjects-3.11.0-1.1.noarch.rpm"
RPM_HASH = "2df40e57a7785afd457321c355d0fd31680d8857a9acf42a66ae935a497466710a63906a53c4f1f3a0d0e3dd3a5c4c8faed3d8da41cd811eb2922e185f24c40a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.versionedobjects \
python314-oslo.versionedobjects \
python3dist-oslo.versionedobjects"

RDEPENDS:${PN} += "python-abi \
python314-WebOb \
python314-iso8601 \
python314-netaddr \
python314-oslo.concurrency \
python314-oslo.config \
python314-oslo.context \
python314-oslo.i18n \
python314-oslo.log \
python314-oslo.messaging \
python314-oslo.serialization \
python314-oslo.utils"

inherit rpm
