SUMMARY = "Python bindings for libxkbcommon using cffi"
DESCRIPTION = "Python bindings for libxkbcommon using cffi"
LICENSE = "MIT"

PV = "1.0"

RPM_NAME = "python313-xkbcommon-1.0-1.11.aarch64.rpm"
RPM_HASH = "567fffdc024e9b2ce8b1bd6be2c5c8242cccebaeb1a33e77653b838a354cf33bf71bc3c9b951bf49706dc74778299a4a7f428606ba747955a3bcee8081c3846f"

RPROVIDES:${PN} += "python3-xkbcommon \
python3.13dist-xkbcommon \
python313-xkbcommon \
python3dist-xkbcommon"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libxkbcommon.so.0 \
python-abi"

inherit rpm
