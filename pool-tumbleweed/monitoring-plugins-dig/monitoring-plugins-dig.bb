SUMMARY = "Test DNS service via dig"
DESCRIPTION = "This plugin test the DNS service on the specified host using dig."
LICENSE = "GPL-2.0-or-later & GPL-3.0-only"

PV = "2.4.0"

RPM_NAME = "monitoring-plugins-dig-2.4.0-5.1.aarch64.rpm"
RPM_HASH = "b93332608851637cc90843582a47b0878883939528a471bae508dd9686b1f8937e8308a4913602fb6b7251f559eb4a85d159c7bfb11f09f7c5df70be70519b5c"

RPROVIDES:${PN} += "monitoring-plugins-dig \
nagios-plugins-dig"

RDEPENDS:${PN} += "/usr/bin/dig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
