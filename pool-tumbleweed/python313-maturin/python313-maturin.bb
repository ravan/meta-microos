SUMMARY = "Rust/Python Interoperability"
DESCRIPTION = "Build and publish crates with pyo3, cffi and uniffi bindings \
as well as rust binaries as python packages. \
 \
It supports building wheels for Python 3.8+, can upload them \
to PyPI and has basic PyPy and GraalPy support."
LICENSE = "Apache-2.0 | MIT"

PV = "1.15.0"

RPM_NAME = "python313-maturin-1.15.0-1.1.aarch64.rpm"
RPM_HASH = "27de45df2ca0851706a28aced8c57888cc29a3c7a2c293c62def189c3e4ba48bad312e3d767918e5e2623ea85a672ebedb3eda79c31f0887dcb1d9331aa96673"

RPROVIDES:${PN} += "python3-maturin \
python3.13dist-maturin \
python313-maturin \
python3dist-maturin"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
