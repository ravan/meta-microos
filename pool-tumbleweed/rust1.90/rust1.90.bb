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

PV = "1.90.0"

RPM_NAME = "rust1.90-1.90.0-2.6.aarch64.rpm"
RPM_HASH = "d342d1affd087d3d7c76462e07b4d7b6e1bb38501a52dde8a0443373813ad0063eb38589d2f433ae67536f87ee484a0a2e0c85437246ef16292f14f777ca4b29"

RPROVIDES:${PN} += "librustc-driver-cbb064e6b7f2da13.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.90"

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
