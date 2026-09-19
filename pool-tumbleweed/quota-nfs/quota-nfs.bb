SUMMARY = "Disk Quota System on NFS"
DESCRIPTION = "The quotad init script, which provides quota support on NFS mounts."
LICENSE = "GPL-2.0-only"

PV = "4.11"

RPM_NAME = "quota-nfs-4.11-1.4.aarch64.rpm"
RPM_HASH = "aa73e2101a4d6cb47b1c75c24274b09d260f6e534e4fee2e3d83523fd38e39f6d235758a1582145a014139d1628fb9ee191c24f292e2832a751c0d40f4b67892"

RPROVIDES:${PN} += "quota-nfs"

RDEPENDS:${PN} += "/usr/bin/mkdir \
/usr/bin/sh \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1 \
libc.so.6 \
libtirpc.so.3 \
libwrap.so.0 \
nfs-kernel-server \
quota \
rpcbind"

inherit rpm
