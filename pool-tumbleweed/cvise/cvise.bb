SUMMARY = "Super-parallel Python port of the C-Reduce"
DESCRIPTION = "C-Vise is a super-parallel Python port of the C-Reduce. The port is fully \
compatible to the C-Reduce and uses the same efficient \
LLVM-based C/C++ reduction tool named clang_delta. \
 \
C-Vise is a tool that takes a large C, C++ or OpenCL program that \
has a property of interest (such as triggering a compiler bug) and \
automatically produces a much smaller C/C++ or OpenCL program that \
has the same property. It is intended for use by people who discover \
and report bugs in compilers and other tools that process C/C++ or OpenCL code."
LICENSE = "BSD-3-Clause"

PV = "2.12.0+git.20260806.e477494"

RPM_NAME = "cvise-2.12.0+git.20260806.e477494-1.1.aarch64.rpm"
RPM_HASH = "c8cad77c7556afb706edced3d82922097c3a4ebc96f79d63977eb44b03c54e1fa03e1b88fb85892f14f56389cd5e9ec762a5ae1d33906be1b146a782c1667ee9"

RPROVIDES:${PN} += "cvise"

RDEPENDS:${PN} += "/usr/bin/env \
astyle \
clang \
colordiff \
indent \
ld-linux-aarch64.so.1 \
libLLVM.so.23.1 \
libc.so.6 \
libclang-cpp.so.23.1 \
libgcc-s.so.1 \
libstdc++.so.6 \
llvm \
python3-Pebble \
python3-chardet \
python3-msgspec \
python3-psutil \
python3-zstandard \
unifdef"

inherit rpm
