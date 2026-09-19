SUMMARY = "Development files for libx86emu"
DESCRIPTION = "An x86 emulation library with focus on usage and \
execution logging functions. \
 \
This package contains the header files for the library API."
LICENSE = "BSD-3-Clause"

PV = "3.7"

RPM_NAME = "libx86emu-devel-3.7-1.6.aarch64.rpm"
RPM_HASH = "cbada797a6add58a24f89407191276f244fdb8263dbe4680abc73b7082a27a38c62d6fc8e592c34266cf527b4e4f9ee6202a3dba634fdc2d5a3d674f336d2c3f"

RPROVIDES:${PN} += "libx86emu-devel"

RDEPENDS:${PN} += "libx86emu3"

inherit rpm
