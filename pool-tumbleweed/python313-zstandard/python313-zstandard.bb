SUMMARY = "Zstandard bindings for Python"
DESCRIPTION = "Zstandard bindings for Python"
LICENSE = "BSD-3-Clause"

PV = "0.25.0"

RPM_NAME = "python313-zstandard-0.25.0-2.2.aarch64.rpm"
RPM_HASH = "8efbc73fb3fb947f64a2330f89f6804425931dfb8bcca67f0af06a983c7698b73452f81508067a249572842c54e095aa645e4d0f37cecb4e00385d8b4ad37a0b"

RPROVIDES:${PN} += "python3-zstandard \
python3.13dist-zstandard \
python313-zstandard \
python3dist-zstandard"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libzstd.so.1 \
libzstd1 \
python-abi \
python313-cffi"

inherit rpm
