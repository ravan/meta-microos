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

PV = "1.86.0"

RPM_NAME = "rust1.86-1.86.0-3.6.aarch64.rpm"
RPM_HASH = "413abc7b129a3468c5333105f42dd7dd33ec9f32a4f50a1dcf587c27230a3eccac74dc3530f3bed152a71734e22b1b57136c304cd85453324142b58ad893c4d1"

RPROVIDES:${PN} += "librustc-driver-afe9c3945b34b726.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.86"

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
