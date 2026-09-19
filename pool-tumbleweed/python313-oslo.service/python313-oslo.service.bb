SUMMARY = "OpenStack oslo.service library"
DESCRIPTION = "oslo.service provides a framework for defining new long-running services using \
the patterns established by other OpenStack applications. It also includes \
utilities long-running applications might need for working with SSL or WSGI, \
performing periodic operations, interacting with systemd, etc."
LICENSE = "Apache-2.0"

PV = "4.8.0"

RPM_NAME = "python313-oslo.service-4.8.0-1.1.noarch.rpm"
RPM_HASH = "fa78a528d46d60af26b84d9b5a0f0c48b385407c939a53438e6f87e4b788f7e4bb5311a1f2dd821156f85a63fe52c6ec2fcf71ff2242c2f91bd3ea572ce19599"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.service \
python3.13dist-oslo.service \
python313-oslo.service \
python3dist-oslo.service"

RDEPENDS:${PN} += "python-abi \
python313-Paste \
python313-PasteDeploy \
python313-Routes \
python313-WebOb \
python313-cotyledon \
python313-debtcollector \
python313-eventlet \
python313-fixtures \
python313-futurist \
python313-greenlet \
python313-oslo.concurrency \
python313-oslo.config \
python313-oslo.i18n \
python313-oslo.log \
python313-oslo.utils \
python313-yappi"

inherit rpm
