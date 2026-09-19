SUMMARY = "NFSv4 ID Mapping Library development libraries"
DESCRIPTION = "In NFSv4, identities of users are conveyed by names rather than user ID \
and group ID. Both the NFS server and client code in the kernel need to \
translate these to numeric IDs."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "nfsidmap-devel-1.0-55.1.aarch64.rpm"
RPM_HASH = "53bd83b3ec34a7ee5ba599d91eb336edafce9d326074f45b342b5b5e5b27c05b8023f91f1485a8a4df4103336cfe3cff93a7cc31a018555ca9c8e9f872da13e8"

RPROVIDES:${PN} += "nfsidmap-devel \
pkgconfig-libnfsidmap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnfsidmap1"

inherit rpm
