SUMMARY = "OpenStack log library"
DESCRIPTION = "OpenStack logging configuration library provides standardized configuration \
for all openstack projects.It also provides custom formatters, handlers and \
support for context specific logging (like resource id's etc)."
LICENSE = "Apache-2.0"

PV = "8.3.1"

RPM_NAME = "python313-oslo.log-8.3.1-1.1.noarch.rpm"
RPM_HASH = "0eb6a3e8ac913453031c73a7ddc2fffd5e966239a17d811ea6b569e0c342c3e9a7edf715cfb4408aeee58e3b806e9a226c9e759533cfd3b98ce5f7c3087967c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.log \
python3.13dist-oslo.log \
python313-oslo.log \
python3dist-oslo.log"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
python-abi \
python313-debtcollector \
python313-oslo.config \
python313-oslo.context \
python313-oslo.i18n \
python313-oslo.serialization \
python313-oslo.utils \
python313-python-dateutil \
python313-systemd"

inherit rpm
