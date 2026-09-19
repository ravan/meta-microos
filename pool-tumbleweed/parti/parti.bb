SUMMARY = "Show partition table information"
DESCRIPTION = "Show partition table information for \
* Master Boot Record (MBR) Partition Table \
* GUID Partition Table (GPT) \
* Apple Partition Map \
* El Torito Bootable CD/DVD \
* zIPL boot info \
 \
It shows the complete information but mostly in uninterpreted form (unlike partitioning tools like fdisk or parted). \
 \
So it can be used to verify the data your favorite partitioning tool has actually written."
LICENSE = "GPL-3.0-only"

PV = "2.13"

RPM_NAME = "parti-2.13-1.1.aarch64.rpm"
RPM_HASH = "5ce37c174b680d03d5298f7d86826ffdde9779782bbc6a4dea0148db3bae6970357db783f1f08477929107ecae88baca5cf0a6e06ea568a50b219a0c1dbfc04f"

RPROVIDES:${PN} += "parti"

RDEPENDS:${PN} += "libblkid.so.1 \
libc.so.6 \
libjson-c.so.5 \
libmediacheck.so.7 \
libuuid.so.1"

inherit rpm
