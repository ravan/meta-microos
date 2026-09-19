SUMMARY = "Device-tree compiler"
DESCRIPTION = "PowerPC kernels are moving towards requiring a small Open \
Firmware-style device tree as the only means of passing information \
from bootloaders/firmware to the kernel. This does not require a full \
Open Firmware implementation. DTC (Device Tree Compiler) is a tool to \
create a static device tree, which is adequate for most embedded \
systems (since their topology will not vary across reboots). DTC is \
available via a git tree: git://ozlabs.org/srv/projects/dtc/dtc.git"
LICENSE = "GPL-2.0-or-later"

PV = "1.7.2"

RPM_NAME = "dtc-1.7.2-2.5.aarch64.rpm"
RPM_HASH = "9c8bfcad2254a5c12a5082e927c86206ee1aa508da330bc9531f4254a584b3e8325d6e4697e5871fbbd30e0c5f215f3c170049ce03be1b60011f6aaa5adf9d3a"

RPROVIDES:${PN} += "dtc"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfdt.so.1 \
libyaml-0.so.2"

inherit rpm
