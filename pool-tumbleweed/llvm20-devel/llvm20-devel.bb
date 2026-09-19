SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "20.1.8"

RPM_NAME = "llvm20-devel-20.1.8-8.2.aarch64.rpm"
RPM_HASH = "9dae13d941ebcdcc5f615bb15ac71a0a594f3c696d5b503ed06442321f3370ea0d30baa448a503473ba2075c36dd17814f67c5912e8f75affd1a08b42d6ca3cb"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
libLTO.so \
llvm-devel-provider \
llvm20-devel \
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
libLLVM20 \
libLTO20 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libomp20-devel \
libstdc++-devel \
libstdc++.so.6 \
llvm20 \
llvm20-gold \
llvm20-polly-devel \
pkgconfig"

inherit rpm
