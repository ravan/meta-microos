SUMMARY = "List all SCSI devices in the system"
DESCRIPTION = "The lsscsi command lists information about SCSI devices in Linux."
LICENSE = "GPL-2.0-or-later"

PV = "0.32"

RPM_NAME = "lsscsi-0.32-1.13.aarch64.rpm"
RPM_HASH = "82e1ddbb4fc2740382772550d2db2c068335f53c83afcb71fb5dbaaacc235a32f67bc909c7398302a4448be1eeba1648d815abd161fdcd86ecc208dc81c0a776"

RPROVIDES:${PN} += "lsscsi \
scsi-/usr/bin/lsscsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
