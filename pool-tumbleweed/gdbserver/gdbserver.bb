SUMMARY = "A standalone server for GDB (the GNU source-level debugger)"
DESCRIPTION = "GDB, the GNU debugger, allows you to debug programs written in C, C++, \
Java, and other languages, by executing them in a controlled fashion \
and printing their data. \
 \
This package provides a program that allows you to run GDB on a different \
machine than the one which is running the program being debugged."
LICENSE = "GPL-3.0-only-with-GCC-exception-3.1 & GPL-3.0-or-later & LGPL-2.1-or-later & LGPL-3.0-or-later"

PV = "16.3"

RPM_NAME = "gdbserver-16.3-7.4.aarch64.rpm"
RPM_HASH = "ec18932fe96012673e9e6c6a577f70fa857dc10924eade43bafaeeda17d7a757b6fc979db9615a763293155643b7e60671f672ce33e9e72641143e0613e44fff"

RPROVIDES:${PN} += "gdbserver"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
