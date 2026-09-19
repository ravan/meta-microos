SUMMARY = "Minimal FFI runtime and ABI for machine learning systems"
DESCRIPTION = "apache-tvm-ffi (tvm_ffi) provides a minimal, dependency-free foreign \
function interface runtime and ABI used to exchange functions, tensors \
and errors between compiled machine learning kernels and Python. It \
ships a compiled runtime shared library together with the C++ headers \
and CMake package configuration so that native projects can link against \
it via find_package(tvm_ffi)."
LICENSE = "Apache-2.0"

PV = "0.1.13.post3"

RPM_NAME = "python313-apache-tvm-ffi-0.1.13.post3-1.1.aarch64.rpm"
RPM_HASH = "53649798ec694a1c0d5214c0aeda08e5c3337ce4bac8449dea5f4a69b373d75ea2c12d39a71230a9091a036a4e6f71afa6d503345708ac5eaab97e5fa66ef6f4"

RPROVIDES:${PN} += "libtvm-ffi-testing.so \
libtvm-ffi.so \
python3-apache-tvm-ffi \
python3.13dist-apache-tvm-ffi \
python313-apache-tvm-ffi \
python3dist-apache-tvm-ffi"

RDEPENDS:${PN} += "/usr/bin/python3.13 \
/usr/bin/sh \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
python-abi \
python313-typing-extensions \
update-alternatives"

inherit rpm
