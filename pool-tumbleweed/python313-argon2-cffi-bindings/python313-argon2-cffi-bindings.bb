SUMMARY = "Low-level Python CFFI Bindings for Argon2"
DESCRIPTION = "argon2-cffi-bindings provides low-level CFFI bindings \
to the Argon2 password hashing algorithm."
LICENSE = "MIT"

PV = "25.1.0"

RPM_NAME = "python313-argon2-cffi-bindings-25.1.0-1.4.aarch64.rpm"
RPM_HASH = "8bc41e550b8259e6251710c0d0525b2dbfa3d72e64e6d9ed47c3bcb736eaacf63eea8fe0e80e1d9fbeebf97bd01e4654ca2824c2cf6d6e0dee1b384132d2368b"

RPROVIDES:${PN} += "python3-argon2-cffi-bindings \
python3.13dist-argon2-cffi-bindings \
python313-argon2-cffi-bindings \
python3dist-argon2-cffi-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
python-abi \
python313-cffi"

inherit rpm
