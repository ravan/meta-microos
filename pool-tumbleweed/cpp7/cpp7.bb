SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cpp7-7.5.0+r278197-24.3.aarch64.rpm"
RPM_HASH = "bf79907483e64b87413d56f71f9d10ffd840bea803e992138f6caf64723c8392e523d2922d8da05a15436e667318dad7816d71e1d32e04e0f00ca7768e9732a6"

RPROVIDES:${PN} += "cpp7"

RDEPENDS:${PN} += "libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libm.so.6 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1"

inherit rpm
