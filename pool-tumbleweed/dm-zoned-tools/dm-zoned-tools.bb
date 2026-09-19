SUMMARY = "'dm-zoned' device-mapper target manager"
DESCRIPTION = "The dmzadm utility formats backend devices used with the dm-zoned device \
mapper. This utility will inspect the device verifying that the device is a \
zoned block device and will prepare and write on-disk dm-zoned metadata \
according to the device capacity, zone size, etc."
LICENSE = "GPL-3.0-only"

PV = "2.2.2"

RPM_NAME = "dm-zoned-tools-2.2.2-1.11.aarch64.rpm"
RPM_HASH = "672344b33c98e12087f45fe57366f1100d7556b942c92d739b86e64afc592eab87b1c694405d81880277341ee385f12086c60537a0f02087fcb5a07a6ac4d476"

RPROVIDES:${PN} += "dm-zoned-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libdevmapper.so.1.03 \
libkmod.so.2 \
libudev.so.1 \
libuuid.so.1"

inherit rpm
