SUMMARY = "Bootstrapping tool for creating supermin appliances"
DESCRIPTION = "supermin is a tool for building supermin appliances. These are tiny \
appliances (similar to virtual machines), usually around 100KB in size, \
which get fully instantiated on-the-fly in a fraction of a second when \
you need to boot one of them."
LICENSE = "GPL-3.0-or-later"

PV = "5.3.5"

RPM_NAME = "supermin-5.3.5-5.1.aarch64.rpm"
RPM_HASH = "e8d0b84aa02c0487530a6c9110ab8e7a8510f62b0b669feebee058227fe7943c3279c64fcc500a1fba465b5b9f6a593684193ff4ccb2a974feee5fd3b3075826"

RPROVIDES:${PN} += "febootstrap \
supermin"

RDEPENDS:${PN} += "distribution-release \
e2fsprogs \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcom-err.so.2 \
libext2fs.so.2 \
libm.so.6 \
librpm.so.10 \
librpmio.so.10 \
tar \
xmlstarlet \
zypper"

inherit rpm
