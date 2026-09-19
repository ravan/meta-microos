SUMMARY = "Freescale/NXP I.MX Chip image deploy tools"
DESCRIPTION = "Freescale/NXP I.MX Chip image deploy tools. This package holds the evolution of \
MFGTools (aka MFGTools v3), which is called the UUU (Universal Update Utility)."
LICENSE = "BSD-3-Clause"

PV = "1.5.201"

RPM_NAME = "mfgtools-1.5.201-1.5.aarch64.rpm"
RPM_HASH = "9c6b6614ada6f723f125f758640dc4165d52ef055a644d5bbd4f463e6484b8df11ff6b0b3042c2618aaab6ec0d420a8c155e4584e4162d098ae4507bdbb49156"

RPROVIDES:${PN} += "mfgtools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbz2.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libtinyxml2.so.11 \
libusb-1.0.so.0 \
libz.so.1 \
libzstd.so.1"

inherit rpm
