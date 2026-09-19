SUMMARY = "A utility to trace the system calls of a program"
DESCRIPTION = "With strace, you can trace the activity of a program.  Information \
about any system calls the program makes and the signals it receives \
and processes can be seen.  Child processes can also be tracked."
LICENSE = "LGPL-2.1-or-later"

PV = "7.2"

RPM_NAME = "strace-7.2-2.1.aarch64.rpm"
RPM_HASH = "61a98801a480ccedb17c249f7fdf63b8540bce2f9d07c9530788ecebc6e5cd6eea965ff0898ca140462a8b5d840249853cd5322b166e5826194c5157d28f96ce"

RPROVIDES:${PN} += "strace"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdw.so.1 \
libselinux.so.1"

inherit rpm
