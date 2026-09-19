SUMMARY = "OpenStack oslo.middleware library"
DESCRIPTION = "Oslo middleware library includes components that can be injected into wsgi \
pipelines to intercept request/response flows. The base class can be enhanced \
with functionality like add/delete/modification of http headers and support \
for limiting size/connection etc."
LICENSE = "Apache-2.0"

PV = "8.1.0"

RPM_NAME = "python314-oslo.middleware-8.1.0-1.2.noarch.rpm"
RPM_HASH = "ba6cfc6cbafffb8f9c946c93e1c7316a7806a952eaca483366c9ad42d179acfbd6f7454af7ec886db4ad111bacbc2b27fc61654d053cb22c6476ec08c4455697"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.middleware \
python314-oslo.middleware \
python3dist-oslo.middleware"

RDEPENDS:${PN} += "python-abi \
python314-Jinja2 \
python314-WebOb \
python314-bcrypt \
python314-debtcollector \
python314-oslo.config \
python314-oslo.context \
python314-oslo.i18n \
python314-oslo.serialization \
python314-oslo.utils \
python314-statsd \
python314-stevedore"

inherit rpm
