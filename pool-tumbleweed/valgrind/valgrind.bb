SUMMARY = "Memory Management Debugger"
DESCRIPTION = "Valgrind checks all memory operations in an application, like read, \
write, malloc, new, free, and delete. Valgrind can find uses of \
uninitialized memory, access to already freed memory, overflows, \
illegal stack operations, memory leaks, and any illegal \
new/malloc/free/delete commands. Another program in the package is \
'cachegrind,' a profiler based on the valgrind engine. \
 \
To use valgrind you should compile your application with '-g -O0' \
compiler options. Afterwards you can use it with: \
 \
valgrind --tool=memcheck --sloppy-malloc=yes --leak-check=yes \
--db-attach=yes my_application, for example. \
 \
More valgrind options can be listed via 'valgrind --help'. There is \
also complete documentation in the /usr/share/doc/packages/valgrind/ \
directory. A debugged application runs slower and needs much more \
memory, but is usually still usable. Valgrind is still in development, \
but it has been successfully used to optimize several KDE applications."
LICENSE = "GFDL-1.2-only & GPL-3.0-or-later"

PV = "3.27.1"

RPM_NAME = "valgrind-3.27.1-1.4.aarch64.rpm"
RPM_HASH = "00911a798183448f25264c0dc56f471c505169a9cf9ab7620c792354b4f95f2ec82a3a208bee4b624261a4a665fa18aade35039f79faa6b1d1c16871d46d220a"

RPROVIDES:${PN} += "callgrind \
valgrind"

RDEPENDS:${PN} += "-glibc >= 2.44 with glibc < 2.45 \
/usr/bin/env \
/usr/bin/perl \
/usr/bin/sh \
libc.so.6"

inherit rpm
