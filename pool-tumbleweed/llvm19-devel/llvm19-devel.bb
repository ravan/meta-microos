SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "19.1.7"

RPM_NAME = "llvm19-devel-19.1.7-14.3.aarch64.rpm"
RPM_HASH = "6ec27cd16d7031e6aef8963ff6364549df969f751e8f4a60f5ec76f818504589c2a1d64ecfd640c09cbd4f5c64b828853c77b5d4ad66e1da6a84fa3b829c356c"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
libLTO.so \
llvm-devel-provider \
llvm19-devel \
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
libLLVM19 \
libLTO19 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libomp19-devel \
libstdc++-devel \
libstdc++.so.6 \
llvm19 \
llvm19-gold \
llvm19-polly-devel \
pkgconfig"

inherit rpm
