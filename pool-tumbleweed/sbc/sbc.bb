SUMMARY = "Bluetooth Low-Complexity, Sub-Band Codec Utilities"
DESCRIPTION = "The package contains utilities for using the SBC codec."
LICENSE = "GPL-2.0-or-later"

PV = "2.2"

RPM_NAME = "sbc-2.2-1.3.aarch64.rpm"
RPM_HASH = "051d36d8322bb67741ccb5872756d6fd94e8b9c53fc5390127644061d2f54a257696b6c03922247947c3e213febe07b633ac4a98d03c6e6da715420d1758849f"

RPROVIDES:${PN} += "sbc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
