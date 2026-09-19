SUMMARY = "Python bindings for libxkbcommon using cffi"
DESCRIPTION = "Python bindings for libxkbcommon using cffi"
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "python314-xkbcommon-1.0-1.11.aarch64.rpm"
RPM_HASH = "bb5833f3b45b15a5ed6a01a49f95c5f19bbfd020d28ed138bcd786b9624a5547a1e754a6f7f24538b65dd9e1aff521b668141e8a27a8efed7a14e2a4f11925d1"

RPROVIDES:${PN} += "python3.14dist-xkbcommon \
python314-xkbcommon \
python3dist-xkbcommon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxkbcommon.so.0 \
python-abi"

inherit rpm
