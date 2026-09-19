SUMMARY = "Tools for writing to TTYs"
DESCRIPTION = "Tools that write to TTYs that the current user does not own."
LICENSE = "BSD-3-Clause"

PV = "2.42.2"

RPM_NAME = "util-linux-tty-tools-2.42.2-2.1.aarch64.rpm"
RPM_HASH = "8c701a730a0ed24a651063bb43f9b6b02fb42c98dccf6af6a6e2bb3ae11b56a6e1160c64c8d2e373aff4ab26d781e9e08e050bc35a4d079e8fbc8d8a68c6d529"

RPROVIDES:${PN} += "util-linux-/usr/bin/mesg \
util-linux-/usr/bin/wall \
util-linux-/usr/bin/write \
util-linux-tty-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
group-tty \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsystemd.so.0 \
permissions"

inherit rpm
