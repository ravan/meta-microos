SUMMARY = "Hwloc GUI tool"
DESCRIPTION = "Hwloc GUI visualization tool - requires X11"
LICENSE = "BSD-3-Clause"

PV = "2.13.0"

RPM_NAME = "hwloc-gui-2.13.0-1.3.aarch64.rpm"
RPM_HASH = "ad5d70e5d7c18d102e8e8eb20ef8d4cb37b3414331e20b72104a81dc5e6d04e00b9449f18894bebbfaf51c838c8582897fce4b4fa7c0b384dd8cd7025659ab34"

RPROVIDES:${PN} += "hwloc-gui"

RDEPENDS:${PN} += "hwloc \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libhwloc.so.15 \
libm.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
