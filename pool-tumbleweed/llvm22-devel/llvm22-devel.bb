SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "22.1.8"

RPM_NAME = "llvm22-devel-22.1.8-3.2.aarch64.rpm"
RPM_HASH = "f42678eb73ec20a8da69798679d48ced363e5eb44f48709abfa2e0f22fa8a664b8f46ad2f4c974449853e9ba87e625791c6010699e3ea94b33cda0cb90230f66"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
libLTO.so \
llvm-devel-provider \
llvm22-devel \
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
libLLVM22 \
libLTO22 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libomp22-devel \
libstdc++-devel \
libstdc++.so.6 \
llvm22 \
llvm22-gold \
llvm22-polly-devel \
pkgconfig"

inherit rpm
