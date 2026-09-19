SUMMARY = "A parallel remote execution system"
DESCRIPTION = "Salt is a distributed remote execution system used to execute commands and \
query data. It was developed in order to bring the best solutions found in \
the world of remote execution together and make them better, faster and more \
malleable. Salt accomplishes this via its ability to handle larger loads of \
information, and not just dozens, but hundreds or even thousands of individual \
servers, handle them quickly and through a simple and manageable interface."
LICENSE = "Apache-2.0"

PV = "3006.0"

RPM_NAME = "salt-3006.0-70.1.aarch64.rpm"
RPM_HASH = "163b9d192ae0adfc20257e04567b37ba0bba342c5b9c67ed38e276c334d5ad7bce179104a08664b99d2ea506017a6b1907db1519a20e259693d5b59d02705484"

RPROVIDES:${PN} += "group-salt \
salt \
user-salt"

RDEPENDS:${PN} += "/usr/bin/sh \
/usr/sbin/groupadd \
/usr/sbin/useradd \
dbus-1 \
iproute2 \
logrotate \
procps \
salt-call \
shadow"

inherit rpm
