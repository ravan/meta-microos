SUMMARY = "A GNU source-level debugger for C, C++, Fortran and other languages"
DESCRIPTION = "GDB, the GNU debugger, allows you to debug programs written in C, C++, \
Java, and other languages, by executing them in a controlled fashion \
and printing their data."
LICENSE = "GPL-3.0-only-with-GCC-exception-3.1 & GPL-3.0-or-later & LGPL-2.1-or-later & LGPL-3.0-or-later & MIT"

PV = "16.3"

RPM_NAME = "gdb-16.3-7.4.aarch64.rpm"
RPM_HASH = "1bd68a54ae13613ec9c2cf610a89a60b11d830403c9e8ef472c52d3a642015a50b83dc71377eb2bcc1a2d53e442ff8393944fa908bfb7c0f74ce23be7e0d55b5"

RPROVIDES:${PN} += "config-gdb \
gdb"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libbabeltrace-ctf.so.1 \
libbabeltrace.so.1 \
libc.so.6 \
libdebuginfod.so.1 \
libexpat.so.1 \
libgcc-s.so.1 \
libgmp.so.10 \
liblzma.so.5 \
libm.so.6 \
libmpfr.so.6 \
libncursesw.so.6 \
libpython3.13.so.1.0 \
libreadline.so.8 \
libsource-highlight.so.4 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1 \
libzstd.so.1 \
python3-base \
python3-rpm"

inherit rpm
