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

PV = "1.87.0"

RPM_NAME = "rust1.87-1.87.0-3.6.aarch64.rpm"
RPM_HASH = "16fd167249324b1b071de0a1bc83f47727f0ca0aa4d323e3579f1ba3f691f0085353bb13d5e9fd72101e535259c5f3536d7703bcdbb066bdf1942a1f7a9441c9"

RPROVIDES:${PN} += "librustc-driver-b8a7f73e14bef514.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.87"

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
