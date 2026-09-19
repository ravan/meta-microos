SUMMARY = "Driver for Thrustmaster wheels"
DESCRIPTION = "Linux kernel module for Thrustmaster T300RS, T248, and (experimental support) TX and TS-XV wheels."
LICENSE = "GPL-2.0-or-later"

PV = "0.0.1+git0.d4c9e06"

RPM_NAME = "hid-tmff2-0.0.1+git0.d4c9e06-1.24.aarch64.rpm"
RPM_HASH = "8784385a78e3ad4142b5efd5b35db2eae7aef011f461e6ff64ad39c3f98fc7478cf994c14e36582b17e1ba03e041db458267ae7bf09506dfdda3eddac8758543"

RPROVIDES:${PN} += "hid-tmff2"

RDEPENDS:${PN} += "hid-tmff2-kmp"

inherit rpm
