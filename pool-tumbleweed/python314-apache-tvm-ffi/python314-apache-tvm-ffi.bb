SUMMARY = "Minimal FFI runtime and ABI for machine learning systems"
DESCRIPTION = "apache-tvm-ffi (tvm_ffi) provides a minimal, dependency-free foreign \
function interface runtime and ABI used to exchange functions, tensors \
and errors between compiled machine learning kernels and Python. It \
ships a compiled runtime shared library together with the C++ headers \
and CMake package configuration so that native projects can link against \
it via find_package(tvm_ffi)."
LICENSE = "Apache-2.0"

PV = "0.1.13.post3"

RPM_NAME = "python314-apache-tvm-ffi-0.1.13.post3-1.1.aarch64.rpm"
RPM_HASH = "4f015db6e827a5329f39caa187a65271f096e387cdb3d0acdfbdbaff825d0293eb622df9c50d2ac5deedbbf1cd1e52e67971627888880a9290a98b0b3f6c51da"

RPROVIDES:${PN} += "libtvm-ffi-testing.so \
libtvm-ffi.so \
python3.14dist-apache-tvm-ffi \
python314-apache-tvm-ffi \
python3dist-apache-tvm-ffi"

RDEPENDS:${PN} += "/usr/bin/python3.14 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python314-typing-extensions \
update-alternatives"

inherit rpm
