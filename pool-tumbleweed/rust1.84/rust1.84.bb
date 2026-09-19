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

PV = "1.84.1"

RPM_NAME = "rust1.84-1.84.1-2.6.aarch64.rpm"
RPM_HASH = "578ead6280cdb911847e3f7a7549dea1589f196b85ee0f1ac5fcc13d3f11d76192c2813d0db936febadce9c915335c9a0b833f956fe3f2ba915dfe0a2f97aebf"

RPROVIDES:${PN} += "librustc-driver-c6d101ba774efa1a.so \
rust+rustc \
rust-gdb \
rust-std \
rust-std-static \
rust1.84"

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
