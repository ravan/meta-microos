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

RPM_NAME = "python314-pyarrow-25.0.0-1.1.aarch64.rpm"
RPM_HASH = "27a4a8f340434d1556dcf14953994c8d601378e7543ba5e27f414669e6dc481e0411056267e6152b77f99cf8c125e7ad1e4b2c6a1d2ab225df128e4273803fb3"

RPROVIDES:${PN} += "lib.cpython-314-aarch64-linux-gnu.so \
libarrow-python-flight.so.2500 \
libarrow-python.so.2500 \
python3.14dist-pyarrow \
python314-pyarrow \
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
python314-numpy"

inherit rpm
