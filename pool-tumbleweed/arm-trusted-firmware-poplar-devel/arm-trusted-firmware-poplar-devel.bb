SUMMARY = "ARM Trusted Firmware -- poplar development files"
DESCRIPTION = "ARM Trusted Firmware provides a reference implementation of \
secure world software for ARMv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3). It implements various ARM interface standards, \
such as the Power State Coordination Interface (PSCI), \
Trusted Board Boot Requirements (TBBR, ARM DEN0006C-1) and \
SMC Calling Convention. As far as possible the code is designed for reuse \
or porting to other ARMv8-A model and hardware platforms. \
 \
This sub-package contains development files."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-poplar-devel-2.12.8-4.1.noarch.rpm"
RPM_HASH = "ddbb6830ddac1df5309101e6cc83ef65b4213d186a677ad900f925bf880f214704057d58fb17952a8e7f0ff15ae003994b013236352e4d64a4e9545edda77b84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arm-trusted-firmware-poplar-devel"

RDEPENDS:${PN} += "arm-trusted-firmware-poplar"

inherit rpm
