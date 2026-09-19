SUMMARY = "Unsigned static network initrd with kernel vanilla."
DESCRIPTION = "The Unsigned static network Initrd build for kernel-vanilla \
7.2.5."
LICENSE = "GPL-3.0-only"

PV = "0.1.0_k7.2.5"

RPM_NAME = "static-initrd-network-vanilla-unsigned-0.1.0_k7.2.5-5.28.aarch64.rpm"
RPM_HASH = "02e3d39a5fb0980ddde4f51601f2524d453a03250d1d2d6f848c00845009d2559f2d4cef34884c0f8979173abce06d2e6ed136a87dca1d4139287181ce30018e"

RPROVIDES:${PN} += "static-initrd-network-vanilla-unsigned"

RDEPENDS:${PN} += "kernel-vanilla"

inherit rpm
