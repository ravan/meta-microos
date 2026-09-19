SUMMARY = "Python 3.13 bindings for ONNX Runtime"
DESCRIPTION = "Python 3.13 bindings for ONNX Runtime. Provides the 'onnxruntime' \
Python package for running ONNX models with high performance."
LICENSE = "Apache-2.0 & MIT & MPL-2.0 & BSL-1.0 & BSD-2-Clause"

PV = "1.27.0"

RPM_NAME = "python313-onnxruntime-1.27.0-2.1.aarch64.rpm"
RPM_HASH = "e5e8890fd56f6d27cea73824cd908f1f48005e1bd2dc31dd30449c566ce62750870a65e6e984c6c47c4dced533c5b9bdae7c955287c6e9daf015cdcd6eaf36dd"

RPROVIDES:${PN} += "libonnxruntime-providers-shared.so \
python3.13dist-onnxruntime \
python313-onnxruntime \
python3dist-onnxruntime"

RDEPENDS:${PN} += "libabsl-hash.so.2608.0.0 \
libabsl-raw-hash-set.so.2608.0.0 \
libabsl-throw-delegate.so.2608.0.0 \
libc.so.6 \
libcpuinfo-suse.so.0 \
libgcc-s.so.1 \
libm.so.6 \
libprotobuf.so.3.21.12.0 \
libre2.so.11 \
libstdc++.so.6 \
python-abi \
python313-flatbuffers \
python313-numpy \
python313-packaging \
python313-protobuf \
python313-sympy"

inherit rpm
