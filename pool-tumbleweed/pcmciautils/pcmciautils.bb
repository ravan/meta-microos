SUMMARY = "Utilities for PC-Cards"
DESCRIPTION = "This package enables the usage of PC-Cards with Linux. It provides \
hotplug scripts, and tools that set up sockets and cards. Since kernel \
2.6.13 card injection and removal are handled completely via hotplug. \
Therefore, a daemon like 'cardmgr' is no longer needed. Soft ejecting \
and inserting cards can be done with pccardctl (it was cardctl before). \
There are also some tools for debugging and CIS handling."
LICENSE = "GPL-2.0-or-later"

PV = "018"

RPM_NAME = "pcmciautils-018-4.9.aarch64.rpm"
RPM_HASH = "4d65171d48585a56fa8a4d47b536a0a03c4af5d3ac35d400d635514b6ee6ec3df06ff0e29ed33a3977214dbef0b7cb6e2ec9a4d705025e1b1683712880f441e2"

RPROVIDES:${PN} += "config-pcmciautils \
firmware-E-CARD.cis \
pcmcia \
pcmciautils"

RDEPENDS:${PN} += "/usr/bin/sh \
group-trusted \
libc.so.6 \
libsysfs.so.2 \
permissions"

inherit rpm
