SUMMARY = "Tool to view Radeon GPU utilization"
DESCRIPTION = "A tool to view Radeon GPU utilization, both for the total activity percent \
and individual blocks. Supported cards are R600 and up, even Southern \
Islands should work fine. Works with both the open drivers and AMD \
Catalyst. The total GPU utilization is also valid for OpenCL loads; the \
other blocks are only useful in GL loads."
LICENSE = "GPL-3.0-only"

PV = "1.4"

RPM_NAME = "radeontop-1.4-2.3.aarch64.rpm"
RPM_HASH = "1a8a6eee2176cce2f1584d21ecb6128c1b7acdd60c2d18334938ee6f33cce8a076a7b36b1347981642dafed2bdca35f878a5d7b4522dbdf731914e98c69aaa52"

RPROVIDES:${PN} += "libradeontop-xcb.so \
radeontop"

RDEPENDS:${PN} += "libc.so.6 \
libdrm-amdgpu.so.1 \
libdrm.so.2 \
libncursesw.so.6 \
libpciaccess.so.0 \
libtinfo.so.6 \
libxcb-dri2.so.0 \
libxcb.so.1"

inherit rpm
