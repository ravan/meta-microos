SUMMARY = "Curses debugger"
DESCRIPTION = "CGDB is a curses (terminal-based) interface to the GNU Debugger (GDB). Its goal \
is to be lightweight and responsive; not encumbered with unnecessary features. \
 \
The primary feature of CGDB is the constant presence of a source display, \
updated as the program executes, to help keep you focused while debugging. The \
interface is inspired by the classic Unix text editor, vi. Those familiar with \
vi (or vim) should feel right at home using CGDB."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.0"

RPM_NAME = "cgdb-0.8.0-2.9.aarch64.rpm"
RPM_HASH = "ad3a0d88501898a3317f299e2a291aaf5e3cc2087378b24f8251dbe35ec9cb78ead0dc4dfdc98820c0e10aadea5aa007b14b822e8c166768c3df635bdb8f3640"

RPROVIDES:${PN} += "cgdb"

RDEPENDS:${PN} += "/usr/bin/sh \
gdb \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libncursesw.so.6 \
libreadline.so.8 \
libstdc++.so.6 \
libtinfo.so.6"

inherit rpm
