SUMMARY = "Tool for cloning data of one machine to other machines"
DESCRIPTION = "Dolly is used to clone data of one machine to (possibly many) \
other machines. It can distribute image files (even gnu-zipped), \
partitions or whole hard disk drives to other partitions or \
hard disk drives. As it forms a 'virtual TCP ring' to distribute \
data, it works best with fast switched networks. \
 \
As dolly can clone whole partitions block-wise, it works for \
most filesystems, including the types for Linux, Windows, Oberon, \
Solaris."
LICENSE = "GPL-2.0-only"

PV = "0.64.2"

RPM_NAME = "dolly-0.64.2-1.16.aarch64.rpm"
RPM_HASH = "bc840d3b8e1e6490f87d986a700bd0ea0dc13fa7c217f1a66dc437f42a547b95bfbf515e2f49a0f2ec07235ee47309766e27b77cdb1e49f12f029168dc444dfe"

RPROVIDES:${PN} += "config-dolly \
dolly"

RDEPENDS:${PN} += "/usr/bin/sh \
gzip \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
