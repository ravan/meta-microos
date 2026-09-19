SUMMARY = "Python bindings for rage (age in Rust)"
DESCRIPTION = "Python bindings for the Rust implementation of age."
LICENSE = "MIT"

PV = "1.2.3"

RPM_NAME = "python314-pyrage-1.2.3-1.14.aarch64.rpm"
RPM_HASH = "e158008dd5bb6717504ff524cdbd85e1d97b47e595e7122d60bf9c0910798db5c9e4c80e31d983637704f7436d513ad60b60e3506b688cde0169b5d9cfceded3"

RPROVIDES:${PN} += "python3.14dist-pyrage \
python314-pyrage \
python3dist-pyrage"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
python-abi"

inherit rpm
