SUMMARY = "Python bindings for mypy AST serialization"
DESCRIPTION = "This is a fast Python extension for parsing Python files and serializing the \
AST using the native binary format used by mypy. This will eventually replace \
the current mypy parser, which uses the Python stdlib ``ast`` module for \
parsing."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python314-ast-serialize-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "3deb22b442402286720a45c913b0e9a5fe8e442382c1ec9113cc44a362a93a41ce3aa3be1607648427e5474afcaeef2cf1a6157cf803d16e7368152239572585"

RPROVIDES:${PN} += "python3.14dist-ast-serialize \
python314-ast-serialize \
python3dist-ast-serialize"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314-ast-serialize"

inherit rpm
