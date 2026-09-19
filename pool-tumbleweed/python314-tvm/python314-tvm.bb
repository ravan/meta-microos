SUMMARY = "An end-to-end Deep Learning Compiler Stack"
DESCRIPTION = "TVM is a deep learning compiler stack for CPUs, GPUs, and specialized accelerators."
LICENSE = "Apache-2.0"

PV = "0.24.0"

RPM_NAME = "python314-tvm-0.24.0-2.3.aarch64.rpm"
RPM_HASH = "b33da76715c31730c8782f98f79a92d4326cdbb5550a996fdf953a9eef0d9aa9ecfbbd49f598aa9abfc159b11f6dab7d810ae529b6d80be3c0d613f3c61009e4"

RPROVIDES:${PN} += "libtvm-compiler.so \
libtvm-runtime.so \
python3.14dist-tvm \
python314-tvm \
python3dist-tvm"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6 \
libtvm-ffi.so \
python-abi \
python314-attrs \
python314-cloudpickle \
python314-decorator \
python314-numpy \
python314-psutil \
python314-synr"

inherit rpm
