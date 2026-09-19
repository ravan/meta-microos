SUMMARY = "Utilities for the Zonefs filesystem"
DESCRIPTION = "Utilities needed to create and maintain zonefs file systems under Linux."
LICENSE = "GPL-2.0-or-later"

PV = "1.7.0"

RPM_NAME = "zonefs-tools-1.7.0-1.6.aarch64.rpm"
RPM_HASH = "e8f84d82f5da098bc74ef6ebefe011132b423e4d47ea60f6bcc3f76671155ea7a8c31ac0b4d62a36571dee9b4f007c9159a33d66cd11bce9b977cf9265cf6945"

RPROVIDES:${PN} += "zonefs-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libblkid.so.1 \
libc.so.6 \
libuuid.so.1"

inherit rpm
