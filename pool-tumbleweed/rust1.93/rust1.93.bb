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

PV = "1.93.0"

RPM_NAME = "rust1.93-1.93.0-3.6.aarch64.rpm"
RPM_HASH = "4e0bc7f7bd887f9b9fffa1b1f7de6c97d24bad6cc59940e674193edcbf6d3f27129caa55b2c565a67a96991869f62cfd9841a935b7856b62bc604f454f5192a7"

RPROVIDES:${PN} += "librustc-driver-7ddaeba64f21cb6b.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.93"

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
