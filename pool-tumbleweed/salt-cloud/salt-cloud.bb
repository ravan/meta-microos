SUMMARY = "Generic cloud provisioning tool for Saltstack"
DESCRIPTION = "public cloud VM management system \
provision virtual machines on various public clouds via a cleanly \
controlled profile and mapping system."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-cloud-3006.0-70.1.aarch64.rpm"
RPM_HASH = "3fed0bba831adff919055fa873b849fced04f2e82203dbe49ca00df35c5ab4783f4190ad282a452c1bee026c0387afa6afad0522c3e60ae987041e5da198c9f1"

RPROVIDES:${PN} += "config-salt-cloud \
salt-cloud"

RDEPENDS:${PN} += "group-salt \
python3-apache-libcloud \
salt \
salt-master"

inherit rpm
