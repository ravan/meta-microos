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

PV = "1.97.1"

RPM_NAME = "rust1.97-1.97.1-1.3.aarch64.rpm"
RPM_HASH = "8c1a891ed80aabb83e0a77dd16aa128dee65c21517adb455254d544d675b12632cb42124cadf1ca65c2d0540c9f18180911e6462a2eed3d687b146d8b70e7c42"

RPROVIDES:${PN} += "librustc-driver-6c10ba4a4fec9ddd.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.97"

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
