SUMMARY = "SDL port of the sopwith game"
DESCRIPTION = "This is a port of the classic computer game 'Sopwith' to run on modern \
computers and operating systems."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.0"

RPM_NAME = "sopwith-2.9.0-1.4.aarch64.rpm"
RPM_HASH = "d6e3bf86385b858f021978473593504fe089c6e23159487c4f99a16297cbdfdbb4ac938e18d2c32efac93b7de510ab4e1a0b573ff8afd0fedb6d4f16361f19ed"

RPROVIDES:${PN} += "sopwith"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libc.so.6 \
libm.so.6"

inherit rpm
