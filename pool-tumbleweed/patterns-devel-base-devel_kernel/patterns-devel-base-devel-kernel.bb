SUMMARY = "Linux Kernel Development"
DESCRIPTION = "Tools for Linux kernel development."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-devel-base-devel_kernel-20170319-13.4.aarch64.rpm"
RPM_HASH = "ec37826e2afd56afbe8ee21e3fa283072a13532ae6e5e621124ad4e9f1618543cad7d3ed9f1256ecffe8c0d553e30bf4f917338423e747858ee3d4dcdefc3a8f"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-devel-base-devel-kernel"

RDEPENDS:${PN} += "pattern-"

inherit rpm
