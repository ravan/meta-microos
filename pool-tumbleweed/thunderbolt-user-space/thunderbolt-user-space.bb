SUMMARY = "Thunderbolt Device Approval support"
DESCRIPTION = "Thunderbolt is a hardware interface developed by Intel/Apple that \
allows the connection of external peripherals to a computer. \
 \
These user-space components implement device approval support: \
 \
* Interaction with the kernel module for approving connected devices. \
* ACL for auto-approving devices white-listed by the user."
LICENSE = "BSD-3-Clause"

PV = "0.9.3"

RPM_NAME = "thunderbolt-user-space-0.9.3-7.7.aarch64.rpm"
RPM_HASH = "9958d1518ff2e874489a0e90219c7669a435781869acf8e72924cdf38292663945c19eb3b6448aa1566d2ef95d5fe4b49f3619e256e4f595cd43e24dbbcb2be1"

RPROVIDES:${PN} += "config-thunderbolt-user-space \
thunderbolt-user-space"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-filesystem.so.1.91.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
procps"

inherit rpm
