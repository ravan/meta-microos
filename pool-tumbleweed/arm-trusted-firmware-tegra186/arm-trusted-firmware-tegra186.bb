SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-tegra186-2.12.8-4.1.noarch.rpm"
RPM_HASH = "332b97a3c87646adbb6e94815599f529fd8828856d81c3b519640036dc00383524a72fbead683c73408666685db40151fabfb6431436074bfd4dca8c6ddf8f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-tegra186"

RDEPENDS:${PN} += ""

inherit rpm
