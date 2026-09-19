SUMMARY = "Python bindings for mypy AST serialization"
DESCRIPTION = "This is a fast Python extension for parsing Python files and serializing the \
AST using the native binary format used by mypy. This will eventually replace \
the current mypy parser, which uses the Python stdlib ``ast`` module for \
parsing."
LICENSE = "MIT"

PV = "0.5.0"

RPM_NAME = "python313-ast-serialize-0.5.0-1.4.aarch64.rpm"
RPM_HASH = "af86685ccd03f97044d2c71722e83a7dafa771de4f532f9c3ed6166fefb355241716780e7bcf74e01ac55f56894b431ce3683c287afa09be8f39928e04f05c82"

RPROVIDES:${PN} += "python3-ast-serialize \
python3.13dist-ast-serialize \
python313-ast-serialize \
python3dist-ast-serialize"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313-ast-serialize"

inherit rpm
