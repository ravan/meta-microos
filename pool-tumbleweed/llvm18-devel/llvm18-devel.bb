SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "18.1.8"

RPM_NAME = "llvm18-devel-18.1.8-13.1.aarch64.rpm"
RPM_HASH = "dbefe4cec7aba58500cbf1e7a4d3346baf6c7d62761f44023f14a560334cdd81a9f3e1bd9c5a1ed1a5ac05afb4320977a6ac9bf2c166c27ba0bc51b23ec0c654"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
libLTO.so \
llvm-devel-provider \
llvm18-devel \
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
libLLVM18 \
libLTO18 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libomp18-devel \
libstdc++-devel \
libstdc++.so.6 \
libtinfo.so.6 \
llvm18 \
llvm18-gold \
llvm18-polly-devel \
pkgconfig"

inherit rpm
