SUMMARY = "Check status of an HP printer"
DESCRIPTION = "This plugin tests the STATUS of an HP printer with a JetDirect card."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-hpjd-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "78b72a562167e805fd2bbce41090d29e2cef5b621be49f431d4ccac56b4d6d77d391f398f29cc15cff900390fd611b8e72ab20306334e317d8b331bce1f6b5e8"

RPROVIDES:${PN} += "monitoring-plugins-hpjd \
nagios-plugins-hpjd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
net-snmp"

inherit rpm
