SUMMARY = "Foreign Function Interface for Python calling C code"
DESCRIPTION = "Foreign Function Interface for Python calling C code. The aim of this project \
is to provide a convenient and reliable way of calling C code from Python."
LICENSE = "MIT"

PV = "2.0.0"

RPM_NAME = "python313-cffi-2.0.0-2.5.aarch64.rpm"
RPM_HASH = "e0ece5c875e8e953e38d6d5f368c90b27170b6de12e80a083fb2a26fd89e1aa2b1b18a52b8a2f99f203375cf55a9e3679c29e8ba4de9e028e45afa4532300c24"

RPROVIDES:${PN} += "python3-cffi \
python3.13dist-cffi \
python313-cffi \
python3dist-cffi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libffi.so.8 \
python-abi \
python313-pycparser"

inherit rpm
