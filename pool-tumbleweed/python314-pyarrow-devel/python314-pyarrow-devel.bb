SUMMARY = "Python library for Apache Arrow - header files"
DESCRIPTION = "Python library for Apache Arrow. \
 \
This package provides the header files within the python \
platlib for consuming modules using cythonization."
LICENSE = "Apache-2.0 & BSD-3-Clause & BSD-2-Clause & MIT"

PV = "25.0.0"

RPM_NAME = "python314-pyarrow-devel-25.0.0-1.1.aarch64.rpm"
RPM_HASH = "d9565b9aee36ad56ab1bcb8f5944b95842043d42c48ab585d7aa77d954388fd5a3bc8d7f88cfa86b2d4d1a8992148dd6765e89a6ec77a9058fa9912273625d63"

RPROVIDES:${PN} += "python314-pyarrow-devel"

RDEPENDS:${PN} += "python-abi \
python314-Cython \
python314-pyarrow"

inherit rpm
