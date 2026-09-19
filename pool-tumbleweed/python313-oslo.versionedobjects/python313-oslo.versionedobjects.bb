SUMMARY = "Oslo Versioned Objects library"
DESCRIPTION = "oslo.versionedobjects library deals with DB schema being at different versions \
than the code expects, allowing services to be operated safely during upgrades. \
It enables DB independent schema by providing an abstraction layer, which \
allows us to support SQL and NoSQL Databases. oslo.versionedobjects is also \
used in RPC APIs, to ensure upgrades happen without spreading version dependent \
code across different services and projects."
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "python313-oslo.versionedobjects-3.11.0-1.1.noarch.rpm"
RPM_HASH = "6ec40a2160065f97dcc217f77932f64160dc41144dd82563e0c9ea9d15794fb66c4ed497a4c77a0c2d095bde79d0e3e81be40ff920c1ab41d0d3303abbe25399"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.versionedobjects \
python3.13dist-oslo.versionedobjects \
python313-oslo.versionedobjects \
python3dist-oslo.versionedobjects"

RDEPENDS:${PN} += "python-abi \
python313-WebOb \
python313-iso8601 \
python313-netaddr \
python313-oslo.concurrency \
python313-oslo.config \
python313-oslo.context \
python313-oslo.i18n \
python313-oslo.log \
python313-oslo.messaging \
python313-oslo.serialization \
python313-oslo.utils"

inherit rpm
