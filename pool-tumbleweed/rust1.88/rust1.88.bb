SUMMARY = "A systems programming language"
DESCRIPTION = "Rust is a systems programming language focused on three goals: safety, \
speed, and concurrency. It maintains these goals without having a \
garbage collector, making it a useful language for a number of use \
cases other languages are not good at: embedding in other languages, \
programs with specific space and time requirements, and writing \
low-level code, like device drivers and operating systems. It improves \
on current languages targeting this space by having a number of \
compile-time safety checks that produce no runtime overhead, while \
eliminating all data races. Rust also aims to achieve 'zero-cost \
abstractions', even though some of these abstractions feel like those \
of a high-level language. Even then, Rust still allows precise control \
like a low-level language would."
LICENSE = "Apache-2.0 | MIT"

PV = "1.88.0"

RPM_NAME = "rust1.88-1.88.0-1.6.aarch64.rpm"
RPM_HASH = "7fd5ef1d96b779f8d8c2dd79e73d93bc90a5bf3298be13cd1a3f5f15bbd0c95ad18bd8ecdac550578c80f5d5ffcb4363402e487a5ecc4e55fbebed821f4b622a"

RPROVIDES:${PN} += "librustc-driver-03601326dc637d21.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.88"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
gcc \
glibc-devel \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1"

inherit rpm
