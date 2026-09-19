SUMMARY = "Rust/Python Interoperability"
DESCRIPTION = "Build and publish crates with pyo3, cffi and uniffi bindings \
as well as rust binaries as python packages. \
 \
It supports building wheels for Python 3.8+, can upload them \
to PyPI and has basic PyPy and GraalPy support."
LICENSE = "Apache-2.0 | MIT"

PV = "1.15.0"

RPM_NAME = "python314-maturin-1.15.0-1.1.aarch64.rpm"
RPM_HASH = "2764476821fab0ac548c7c73388e5fec501096226da5226a28087b93bc544dc1fbb82a967dfe791713ebd17803c156a8aabeca23ba77a67cd7f7b33e082dd756"

RPROVIDES:${PN} += "python3.14dist-maturin \
python314-maturin \
python3dist-maturin"

RDEPENDS:${PN} += "/usr/bin/sh \
alts \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
python-abi"

inherit rpm
