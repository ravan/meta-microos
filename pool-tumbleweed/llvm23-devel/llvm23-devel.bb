SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "23.1.1"

RPM_NAME = "llvm23-devel-23.1.1-1.1.aarch64.rpm"
RPM_HASH = "52b83804d62c9c6ea4dd0dc1b1d62446188a082f7f18809f0432f24f2d5a14a5df671dde3494f3966e48a5a4e8637044c1615b1260f90f8d319dc44945d3834f"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
libLTO.so \
llvm-devel-provider \
llvm23-devel \
rpm-macro--libclang-sonum \
rpm-macro--libcxx-sonum \
rpm-macro--llvm-minorver \
rpm-macro--llvm-relver \
rpm-macro--llvm-sonum \
rpm-macro--llvm-version \
rpm-macro--llvm-with-ffi \
rpm-macro--llvm-with-libcxx \
rpm-macro--llvm-with-lldb \
rpm-macro--llvm-with-openmp \
rpm-macro--llvm-with-oprofile \
rpm-macro--llvm-with-valgrind"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libLLVM23 \
libLTO23 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libomp23-devel \
libstdc++-devel \
libstdc++.so.6 \
llvm23 \
llvm23-gold \
llvm23-polly-devel \
pkgconfig"

inherit rpm
