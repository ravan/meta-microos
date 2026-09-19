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

PV = "1.96.1"

RPM_NAME = "rust1.96-1.96.1-1.3.aarch64.rpm"
RPM_HASH = "e4d587e948bb6ac1911dc54c86a867473c5b29c3a4f0a9c74fbc56be012b76e0abd16b9611b1a02a2b428e7b70902be7a5cc4c9eaf4b782f90cb13691c64acd4"

RPROVIDES:${PN} += "librustc-driver-b81dff22ba200099.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.96"

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
