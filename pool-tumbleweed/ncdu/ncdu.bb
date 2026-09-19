SUMMARY = "NCurses Disk Usage"
DESCRIPTION = "ncdu (NCurses Disk Usage) is a curses-based version of \
the well-known 'du', and provides a fast way to see what \
directories are using your disk space."
LICENSE = "MIT"

PV = "1.22"

RPM_NAME = "ncdu-1.22-1.5.aarch64.rpm"
RPM_HASH = "aa78c26b0e97bbf8ee38651a5149cc41f33c8072dba14bc1a8bf64c29939a0ac7955831858d3ea53214551b374a0c2cd405912144a2a830202b8d0e12aee9d9b"

RPROVIDES:${PN} += "ncdu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libncursesw.so.6 \
libtinfo.so.6"

inherit rpm
