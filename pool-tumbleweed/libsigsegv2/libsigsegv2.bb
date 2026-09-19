SUMMARY = "Library for Handling Page Faults in User Mode"
DESCRIPTION = "This is a library for handling page faults in user mode. A page fault occurs \
when a program tries to access to a region of memory that is currently not \
available."
LICENSE = "GPL-2.0-or-later"

PV = "2.15"

RPM_NAME = "libsigsegv2-2.15-1.1.aarch64.rpm"
RPM_HASH = "caf9813de2e7c2e3c786dbfdef0ef361bbba79326254f177a0d2a964ea9ee5517a43d3b8f6ba963e60404de5623886d1ed24a6858d45bcc7d8f9f4135af5d585"

RPROVIDES:${PN} += "libsigsegv.so.2 \
libsigsegv2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
