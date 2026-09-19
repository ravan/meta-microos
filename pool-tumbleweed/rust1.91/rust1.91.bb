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

PV = "1.91.0"

RPM_NAME = "rust1.91-1.91.0-3.7.aarch64.rpm"
RPM_HASH = "6645f25a5c4f8fd5d8cdf8396894a8a7b163767586c938a19aeb95951edb7c71e3df554fa0b2e69052a98e78ee31f1418b2fe7b40adb9b476c3dae9eb4d45823"

RPROVIDES:${PN} += "librustc-driver-cdf2851a4fcf343d.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.91"

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
