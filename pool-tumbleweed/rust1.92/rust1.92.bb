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

PV = "1.92.0"

RPM_NAME = "rust1.92-1.92.0-3.4.aarch64.rpm"
RPM_HASH = "58ccbb1bb4036016063b3b6dd8de39d118d1c200013090020c7fe95172258fd102ceb3aad75b19d2178eb70dcd6f0d6d21a009025181126f5077fe30dd4d1a7b"

RPROVIDES:${PN} += "librustc-driver-b99415d3627d4562.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.92"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
clang \
gcc16 \
glibc-devel \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libz.so.1 \
lld"

inherit rpm
