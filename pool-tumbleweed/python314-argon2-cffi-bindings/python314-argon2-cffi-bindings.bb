SUMMARY = "Low-level Python CFFI Bindings for Argon2"
DESCRIPTION = "argon2-cffi-bindings provides low-level CFFI bindings \
to the Argon2 password hashing algorithm."
LICENSE = "MIT"

PV = "25.1.0"

RPM_NAME = "python314-argon2-cffi-bindings-25.1.0-1.4.aarch64.rpm"
RPM_HASH = "8cc2005f1d90380127c74bc3033baac3b59f4b775f0b514d03f330314dd1746b96e8cb088368ac49ec691942474f8a9300cc614e0f5b32afbe8f34f30eeeff78"

RPROVIDES:${PN} += "python3.14dist-argon2-cffi-bindings \
python314-argon2-cffi-bindings \
python3dist-argon2-cffi-bindings"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libargon2.so.1 \
libc.so.6 \
python-abi \
python314-cffi"

inherit rpm
