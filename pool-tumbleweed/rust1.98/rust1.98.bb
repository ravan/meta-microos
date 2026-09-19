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

PV = "1.98.1"

RPM_NAME = "rust1.98-1.98.1-1.1.aarch64.rpm"
RPM_HASH = "1dfed53829f072a610426741234e1bf208f7f7fcb92155a4eb574a7c134471e413728636407ed462551cbe54c8f4b13ff4bfdc0a9e0fa74dd1cb35d5d7f9e7d6"

RPROVIDES:${PN} += "librustc-driver-4006781577fb8deb.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.98"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
clang \
gcc \
glibc-devel \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
lld"

inherit rpm
