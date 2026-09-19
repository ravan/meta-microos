SUMMARY = "Poor-man’s PSCI monitor for Raspberry Pi4"
DESCRIPTION = "PSCI EL3 monitor for Raspberry Pi4. Monitor is used to workaround \
CVE-2017-5715 and CVE-2018-3639 for Cortex-A72 CPU used in BCM2711."
LICENSE = "BSD-3-Clause"

PV = "2020.09.24"

RPM_NAME = "raspberrypi-tools-armstubs-2020.09.24-2.8.aarch64.rpm"
RPM_HASH = "7b4a9e3d8b765c61eb8ef26e445ced98dba06f4b9f1f5749081adad39b8620636f5c197cda9d779b5da06dcae62c1ebbaadc204b1042f6565de3ba3e1a86ce0c"

RPROVIDES:${PN} += "raspberrypi-tools-armstubs"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
