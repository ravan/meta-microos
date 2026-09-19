SUMMARY = "Header Files for LLVM"
DESCRIPTION = "This package contains library and header files needed to develop \
new native programs that use the LLVM infrastructure."
LICENSE = "Apache-2.0-with-LLVM-exception & NCSA"

PV = "21.1.8"

RPM_NAME = "llvm21-devel-21.1.8-9.2.aarch64.rpm"
RPM_HASH = "a5fa20bd45877689d4edc5734aa3b8051497cf6c61c115770afc960e787d02a0386a1f51dfc39f13836b0581447a6455f1e7557aa3b91fc0e6ac570d5147fd08"

RPROVIDES:${PN} += "cmake-LLVM \
cmake-LLVM- \
libLTO.so \
llvm-devel-provider \
llvm21-devel \
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
libLLVM21 \
libLTO21 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libomp21-devel \
libstdc++-devel \
libstdc++.so.6 \
llvm21 \
llvm21-gold \
llvm21-polly-devel \
pkgconfig"

inherit rpm
