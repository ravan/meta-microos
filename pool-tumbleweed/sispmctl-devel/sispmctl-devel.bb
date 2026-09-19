SUMMARY = "Development files for sispmctl"
DESCRIPTION = "Development files for the GEMBIRD Silver Shield PM device."
LICENSE = "GPL-2.0-only"

PV = "4.12"

RPM_NAME = "sispmctl-devel-4.12-1.8.aarch64.rpm"
RPM_HASH = "d6222608a5e5aac18b186d2e26013afebd9b7d90cb22effc48cb46bc4e1cdf17c17b9907e555c404a8579a105bbe964814a9045fb90e09a660ae1d0756ef8d67"

RPROVIDES:${PN} += "sispmctl-devel"

RDEPENDS:${PN} += "libsispmctl0"

inherit rpm
