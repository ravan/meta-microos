SUMMARY = "A CPython extension module wrapping the libcrack library"
DESCRIPTION = "This CPython extension provides Python bindings for cracklib. It \
contains a pythonic interface to cracklib's functions and some Python \
convenience functions."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.6"

RPM_NAME = "python313-cracklib-2.9.6-2.7.aarch64.rpm"
RPM_HASH = "8145555f1cae6877a0fe798745c8f0a6b365d14aa22316e873673dbe9f4eb26a741b7ee5602173846d2c423ce2a2048559b32cd6b9d1887c8585ac4c2f1070c2"

RPROVIDES:${PN} += "python3-cracklib \
python3.13dist-cracklib \
python313-cracklib \
python3dist-cracklib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2 \
python-abi"

inherit rpm
