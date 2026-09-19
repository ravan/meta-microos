SUMMARY = "Udev rules for HackRF"
DESCRIPTION = "Udev rules for HackRF."
LICENSE = "GPL-2.0-only"

PV = "2026.01.3"

RPM_NAME = "hackrf-udev-2026.01.3-1.4.aarch64.rpm"
RPM_HASH = "4f3ea8b1fae6e00aaa288f2a1b7c41dc06137abb4cc2fd340a74296e84436eef4cad65d4abe8b019019a21a996da13c5efdbe1f716f0c6c752b67c5a74a06501"

RPROVIDES:${PN} += "hackrf-udev"

RDEPENDS:${PN} += "/usr/bin/sh \
shadow"

inherit rpm
