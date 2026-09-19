SUMMARY = "Python 3.5+ concrete syntax tree with AST-like properties"
DESCRIPTION = "A concrete syntax tree with AST-like properties for Python 3.5+ programs."
LICENSE = "MIT"

PV = "1.8.6"

RPM_NAME = "python313-libcst-1.8.6-2.2.aarch64.rpm"
RPM_HASH = "f3b158dcaea10b82d792c0abce82c460f2697be702f7b188b75fbcc39ec198fda6e8cae8a7a9ebf69c3edc04300858da8a29041dcc22bde4c8c40c3e738a41ea"

RPROVIDES:${PN} += "python3-libcst \
python3.13dist-libcst \
python313-libcst \
python3dist-libcst"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi \
python313-PyYAML"

inherit rpm
