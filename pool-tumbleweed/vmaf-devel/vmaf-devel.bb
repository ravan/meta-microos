SUMMARY = "Development tools for Video Multi-Method Assessment Fusion"
DESCRIPTION = "VMAF is a perceptual video quality assessment algorithm developed by \
Netflix. \
This package contains the library API definitions."
LICENSE = "BSD-2-Clause-Patent & BSD-3-Clause"

PV = "3.2.0"

RPM_NAME = "vmaf-devel-3.2.0-1.3.aarch64.rpm"
RPM_HASH = "b90021ad1fc4e11c0e08f2a5b73859d464f614f2a29e24ff1ec230e430d3ad48898edaf02974c14e17dfc7f80ccb9b2d1dfbeb1e768a6551dfa395742906d74a"

RPROVIDES:${PN} += "pkgconfig-libvmaf \
vmaf-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libvmaf3"

inherit rpm
