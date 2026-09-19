SUMMARY = "NFSv4 ID Mapping Library"
DESCRIPTION = "In NFSv4, identities of users are conveyed by names rather than user ID \
and group ID. Both the NFS server and client code in the kernel need to \
translate these to numeric IDs."
LICENSE = "GPL-2.0-or-later"

PV = "1.0"

RPM_NAME = "libnfsidmap1-1.0-55.1.aarch64.rpm"
RPM_HASH = "747d13dc771f475674350c41e8bfba97c2148269ece94ed48c204d93d9a1dd69ffd4a9fd30909b9aea7728ffd3b3caa7809df41dc7a4a5ece25ccf2a479c803f"

RPROVIDES:${PN} += "libnfsidmap.so.1 \
libnfsidmap1 \
nfsidmap"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
