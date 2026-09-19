SUMMARY = "Ext2fs scrubbing scripts and service files"
DESCRIPTION = "Scripts and systemd service files for background scrubbing of LVM volumes \
with ext2, ext3, and ext4 filesystems."
LICENSE = "GPL-2.0-only"

PV = "1.47.3"

RPM_NAME = "e2fsprogs-scrub-1.47.3-2.2.aarch64.rpm"
RPM_HASH = "63bcd0e4844ee092f3358048a68bf4a4a51f62d40d57cc5837b5bc9ff8c0f51e328c31848828e0e474bf4a8946297e99779fd60fc49c354cdf585eedfd06cd07"

RPROVIDES:${PN} += "config-e2fsprogs-scrub \
e2fsprogs-scrub"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
e2fsprogs \
lvm2 \
postfix \
systemd \
util-linux"

inherit rpm
