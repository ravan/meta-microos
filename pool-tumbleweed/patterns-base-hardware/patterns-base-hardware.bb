SUMMARY = "Hardware Support"
DESCRIPTION = "Packages required to install minimal host on real hardware."
LICENSE = "MIT"

PV = "20241218"

RPM_NAME = "patterns-base-hardware-20241218-34.1.aarch64.rpm"
RPM_HASH = "ac28103d2dff9a371bf51ed4a97fc5707a247f84e17cea52f8a37883a74c3f949962b5933a967332d80c843c33d7633b80ecebf1e4ac0575fab981f4e708c824"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-base-hardware \
patterns-micro-hardware \
patterns-microos-hardware"

RDEPENDS:${PN} += "ethtool \
fcoe-utils \
hwinfo \
irqbalance \
kernel-firmware-all"

inherit rpm
