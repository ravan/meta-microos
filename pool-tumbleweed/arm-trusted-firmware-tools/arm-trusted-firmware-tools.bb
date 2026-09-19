SUMMARY = "Tools for ARM Trusted Firmware-A"
DESCRIPTION = "Trusted Firmware-A (TF-A) provides a reference implementation of \
secure world software for ARMv8-A, including a Secure Monitor executing at \
Exception Level 3 (EL3). It implements various ARM interface standards, \
such as the Power State Coordination Interface (PSCI), \
Trusted Board Boot Requirements (TBBR, ARM DEN0006C-1) and \
SMC Calling Convention. As far as possible the code is designed for reuse \
or porting to other ARMv8-A model and hardware platforms. \
 \
This package contains fiptool."
LICENSE = "BSD-3-Clause"

PV = "2.12.8"

RPM_NAME = "arm-trusted-firmware-tools-2.12.8-4.1.aarch64.rpm"
RPM_HASH = "ee7d4343e2813a9dab517e578154a55a2521cb9d902d5fc19d9649206c177fb97058fa99ace0af5cefe863f4e559380a964b1b9969755a0da90aac0ddf0b596a"

RPROVIDES:${PN} += "arm-trusted-firmware-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libcryptopp.so.8.9.0 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
