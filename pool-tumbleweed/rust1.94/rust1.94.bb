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

PV = "1.94.1"

RPM_NAME = "rust1.94-1.94.1-1.6.aarch64.rpm"
RPM_HASH = "4ff42012fbc126442c5f8f15cf144a0309d148ea4307193aa0d2bd74f4577b18a11c37e1f1e43d4e1ee7cd18c63bfac03863218dae6021f8aa25c1bf08b7d3ab"

RPROVIDES:${PN} += "librustc-driver-19a3cc8f92f3378a.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.94"

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
