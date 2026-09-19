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

PV = "1.95.0"

RPM_NAME = "rust1.95-1.95.0-1.4.aarch64.rpm"
RPM_HASH = "9b2a90c78b7eb1ad80ac592f1894be4dfe3a2dc8a3f14a2b70e6f9f950a4138c25e4c245621fa76f4adb5248019a179a649d08c2d593f92ea177576187aa0027"

RPROVIDES:${PN} += "librustc-driver-2c0877b6a098e3c8.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.95"

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
