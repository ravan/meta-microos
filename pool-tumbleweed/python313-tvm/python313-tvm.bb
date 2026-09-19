SUMMARY = "An end-to-end Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "python313-tvm-0.24.0-2.3.aarch64.rpm"
RPM_HASH = "714911cd493940e8875a2d3acfc64cd7aa0c670afc611ff53677d5f705950dfde3538c1857795e1d91f20f65fe18e827ac2b354e2eb2fa5f5938d46fc5f2def9"

RPROVIDES:${PN} += "libtvm-compiler.so \
libtvm-runtime.so \
python3-tvm \
python3.13dist-tvm \
python313-tvm \
python3dist-tvm"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtvm-ffi.so \
python-abi \
python313-attrs \
python313-cloudpickle \
python313-decorator \
python313-numpy \
python313-psutil \
python313-synr"

inherit rpm
