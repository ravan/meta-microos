SUMMARY = "Tool for recovering deleted files on ext3/4 filesystems"
DESCRIPTION = "ext4magic is a tool which can help recover accidentally deleted or \
overwritten files from ext3 or ext4 file systems. Especially private \
computers may lack an adequate, frequent or reliable backup."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.2"

RPM_NAME = "ext4magic-0.3.2-4.28.aarch64.rpm"
RPM_HASH = "8761faf2cde3d3c3678e618f6ff99dc316b876b6efddf3c82b317e32531564eb93343ec924056bd8b18b818711b967743d3388f30669545e7c901d824e3d2f35"

RPROVIDES:${PN} += "ext4magic"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libbz2.so.1 \
libc.so.6 \
libe2p.so.2 \
libext2fs.so.2 \
libmagic.so.1 \
libuuid.so.1 \
libz.so.1"

inherit rpm
