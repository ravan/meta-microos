SUMMARY = "OpenStack log library"
DESCRIPTION = "OpenStack logging configuration library provides standardized configuration \
for all openstack projects.It also provides custom formatters, handlers and \
support for context specific logging (like resource id's etc)."
LICENSE = "Apache-2.0"

PV = "8.3.1"

RPM_NAME = "python314-oslo.log-8.3.1-1.1.noarch.rpm"
RPM_HASH = "87cf88e13132a21110019c2e0999a0a690a1cb5bfc1d23996d68c72325141b9ea4328a4a6a0ba829214aecf3ec532ac106fccfe1a786035db64f1ed70211fac4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.14dist-oslo.log \
python314-oslo.log \
python3dist-oslo.log"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
python-abi \
python314-debtcollector \
python314-oslo.config \
python314-oslo.context \
python314-oslo.i18n \
python314-oslo.serialization \
python314-oslo.utils \
python314-python-dateutil \
python314-systemd"

inherit rpm
