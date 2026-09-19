SUMMARY = "Python library for Apache Arrow"
DESCRIPTION = "Python library for Apache Arrow. \
 \
Apache Arrow defines a language-independent columnar \
memory format for flat and hierarchical data, organized \
for efficient analytic operations on modern hardware like \
CPUs and GPUs. The Arrow memory format also supports \
zero-copy reads for lightning-fast data access without \
serialization overhead. \
 \
Arrow's libraries implement the format and provide building \
blocks for a range of use cases, including high performance \
analytics. Many popular projects use Arrow to ship columnar \
data efficiently or as the basis for analytic engines."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "python313-pyarrow-25.0.0-1.1.aarch64.rpm"
RPM_HASH = "ed71697cac7cecad696934e8e8430d8e6f7583fab3c1a2d27e71d250d36044cb9c592fde6508dea067d3aa09ed2937d25a10d2aca52d5ce503aab4eaa36d1fe5"

RPROVIDES:${PN} += "lib.cpython-313-aarch64-linux-gnu.so \
libarrow-python-flight.so.2500 \
libarrow-python.so.2500 \
python3-pyarrow \
python3.13dist-pyarrow \
python313-pyarrow \
python3dist-pyarrow"

RDEPENDS:${PN} += "libarrow-acero.so.2500 \
libarrow-compute.so.2500 \
libarrow-dataset.so.2500 \
libarrow-flight.so.2500 \
libarrow.so.2500 \
libc.so.6 \
libgcc-s.so.1 \
libparquet.so.2500 \
libstdc++.so.6 \
python-abi \
python313-numpy"

inherit rpm
