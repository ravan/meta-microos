SUMMARY = "Scientific calculator for X"
DESCRIPTION = "xcalc is a scientific calculator X11 client that can emulate a TI-30 \
or an HP-10C."
LICENSE = "MIT"

PV = "1.1.3"

RPM_NAME = "xcalc-1.1.3-1.5.aarch64.rpm"
RPM_HASH = "73cc144e567e14109a3dce49c433f73bec4ee42dd6f846eac666b271d34c19cae9b1c57bda057da4c969917d273c8a9d241a1f56a4df77e3a1cc3bdffdf4e1a9"

RPROVIDES:${PN} += "xcalc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXaw.so.7 \
libXt.so.6 \
libc.so.6 \
libm.so.6"

inherit rpm
