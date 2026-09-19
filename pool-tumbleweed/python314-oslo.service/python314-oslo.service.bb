SUMMARY = "OpenStack oslo.service library"
DESCRIPTION = "oslo.service provides a framework for defining new long-running services using \
the patterns established by other OpenStack applications. It also includes \
utilities long-running applications might need for working with SSL or WSGI, \
performing periodic operations, interacting with systemd, etc."
LICENSE = "Apache-2.0"

PV = "4.8.0"

RPM_NAME = "python314-oslo.service-4.8.0-1.1.noarch.rpm"
RPM_HASH = "4df68e6d57b5c71f01cf4f68a52a5fe7dae1ff445160c124f5b42cf07cef9f0c82502e99910983065c6d2590f89b0e6f559463f93c650eb5aac9e017f4c38aa0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.service \
python314-oslo.service \
python3dist-oslo.service"

RDEPENDS:${PN} += "python-abi \
python314-Paste \
python314-PasteDeploy \
python314-Routes \
python314-WebOb \
python314-cotyledon \
python314-debtcollector \
python314-eventlet \
python314-fixtures \
python314-futurist \
python314-greenlet \
python314-oslo.concurrency \
python314-oslo.config \
python314-oslo.i18n \
python314-oslo.log \
python314-oslo.utils \
python314-yappi"

inherit rpm
