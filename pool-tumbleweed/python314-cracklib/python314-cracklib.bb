SUMMARY = "A CPython extension module wrapping the libcrack library"
DESCRIPTION = "This CPython extension provides Python bindings for cracklib. It \
contains a pythonic interface to cracklib's functions and some Python \
convenience functions."
LICENSE = "GPL-2.0-or-later"

PV = "2.9.6"

RPM_NAME = "python314-cracklib-2.9.6-2.7.aarch64.rpm"
RPM_HASH = "338b664de433ef9e2e96abb7663fdad4d54becf005b83623c5d021d8d5bcfcfab56ff5bc80ca0ef8e8822bbfc57c20c890b6137c01e1a82b24a4b4405cca9b20"

RPROVIDES:${PN} += "python3.14dist-cracklib \
python314-cracklib \
python3dist-cracklib"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcrack.so.2 \
python-abi"

inherit rpm
