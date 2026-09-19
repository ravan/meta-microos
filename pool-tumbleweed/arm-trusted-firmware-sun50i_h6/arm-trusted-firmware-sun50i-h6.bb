SUMMARY = "Arm Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of secure world \
software for Armv7-A and Armv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3)."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-sun50i_h6-2.12.8-4.1.noarch.rpm"
RPM_HASH = "5fcca58ddf7ba790f3c2dc5566bbb567706e7df34dc291af1defd16c03a8a8801057611c0c0644edbe897c2fb680f0fd4b6f741e122de36ae873b06673ed7126"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-sun50i-h6"

RDEPENDS:${PN} += ""

inherit rpm
