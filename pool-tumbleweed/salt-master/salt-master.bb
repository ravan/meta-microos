SUMMARY = "The management component of Saltstack with zmq protocol supported"
DESCRIPTION = "The Salt master is the central server to which all minions connect. \
Enabled commands to remote systems to be called in parallel rather \
than serially."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-master-3006.0-70.1.aarch64.rpm"
RPM_HASH = "6a3cd38083932dd3bee9fb2218de64bbb20127286cc1bff8d89c507371018471cbfe380cf9cac13ca1d944290c412a070c22a67bd0a0267aa361f10b65277e10"

RPROVIDES:${PN} += "config-salt-master \
salt-master"

RDEPENDS:${PN} += "/usr/bin/sh \
group-salt \
salt \
systemd \
user-salt"

inherit rpm
