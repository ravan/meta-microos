SUMMARY = "OpenStack oslo.middleware library"
DESCRIPTION = "Oslo middleware library includes components that can be injected into wsgi \
pipelines to intercept request/response flows. The base class can be enhanced \
with functionality like add/delete/modification of http headers and support \
for limiting size/connection etc."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python313-oslo.middleware-8.1.0-1.2.noarch.rpm"
RPM_HASH = "11145280f291e34e3a45670b02c6d6cd80daeaf76de2c177d8f41265bc033b4ba69105a42c6389d894a95f8fcf0c4e4d954fbc8bf510e772f2ace9089d369d51"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.middleware \
python3.13dist-oslo.middleware \
python313-oslo.middleware \
python3dist-oslo.middleware"

RDEPENDS:${PN} += "python-abi \
python313-Jinja2 \
python313-WebOb \
python313-bcrypt \
python313-debtcollector \
python313-oslo.config \
python313-oslo.context \
python313-oslo.i18n \
python313-oslo.serialization \
python313-oslo.utils \
python313-statsd \
python313-stevedore"

inherit rpm
