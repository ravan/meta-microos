SUMMARY = "Python 3.14 bindings for ONNX Runtime"
DESCRIPTION = "Python 3.14 bindings for ONNX Runtime. Provides the 'onnxruntime' \
Python package for running ONNX models with high performance."
LICENSE = "Apache-2.0 & MIT & MPL-2.0 & BSL-1.0 & BSD-2-Clause"

PV = "1.27.0"

RPM_NAME = "python314-onnxruntime-1.27.0-2.1.aarch64.rpm"
RPM_HASH = "361cbf163cb57bb8277fecf983124b624fda10dee5025e740d099b6f20af68a6ceed2eb99ff5733462145a62d85a3f7db48c4deb6aac3dcdccbaef76262476d2"

RPROVIDES:${PN} += "libonnxruntime-providers-shared.so \
python3.14dist-onnxruntime \
python314-onnxruntime \
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
python314-flatbuffers \
python314-numpy \
python314-packaging \
python314-protobuf \
python314-sympy"

inherit rpm
