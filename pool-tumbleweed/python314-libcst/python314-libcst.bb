SUMMARY = "Python 3.5+ concrete syntax tree with AST-like properties"
DESCRIPTION = "A concrete syntax tree with AST-like properties for Python 3.5+ programs."
LICENSE = "MIT"

PV = "1.8.6"

RPM_NAME = "python314-libcst-1.8.6-2.2.aarch64.rpm"
RPM_HASH = "fe694df6fa05de7a33c0cbcf790ae7499e5d7c62b6f2afa3b372298fc3f4203d9fbbb00bdf4de35a3dd3d27de6d4ac9c307e468cbc61fb1f9cc2393325ca8646"

RPROVIDES:${PN} += "python3.14dist-libcst \
python314-libcst \
python3dist-libcst"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python314-PyYAML"

inherit rpm
