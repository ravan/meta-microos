SUMMARY = "A virtual machine built especially for Rakudo"
DESCRIPTION = "Short for 'Metamodel On A Runtime', MoarVM is a modern virtual machine built \
for the Rakudo compiler implementing the Raku Programming Language, and the \
NQP Compiler Toolchain. MoarVM is used by the majority of Raku programmers. \
Highlights include: \
 \
Great Unicode support, with strings represented at grapheme level \
Dynamic analysis of running code to identify hot functions and loops, and \
perform a range of optimizations, including type specialization and inlining \
Support for threads, a range of concurrency control constructs, and asynchronous \
sockets, timers, processes, and more \
Generational, parallel, garbage collection"
LICENSE = "Artistic-2.0"

PV = "2025.05"

RPM_NAME = "moarvm-2025.05-1.6.aarch64.rpm"
RPM_HASH = "09f472e10018c861b623d2a837f52fded0b7031e0cb185917836a1fcd84dc2e443f62cb35d1299f37d415b514dd728398fc55c74338f9936b0b90ea0b8b9d687"

RPROVIDES:${PN} += "libmoar.so \
moarvm"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
libm.so.6 \
libtommath.so.1 \
libuv.so.1 \
libzstd.so.1"

inherit rpm
