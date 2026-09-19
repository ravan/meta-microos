SUMMARY = "Xilinx based arm64 systems"
DESCRIPTION = "Device Tree files for Xilinx based arm64 systems."
LICENSE = "GPL-2.0-only"

PV = "7.2.5"

RPM_NAME = "dtb-xilinx-7.2.5-1.1.aarch64.rpm"
RPM_HASH = "4f72337e74f67131da02aedb6c5412c987419ec34227c2be287998260ea152a271718468c2b55f9467968378914a6099ef55cee0600145071b0625331fd9a133"

RPROVIDES:${PN} += "dtb-xilinx \
multiversion-dtb"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils"

inherit rpm
