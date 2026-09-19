SUMMARY = "The sip module support for PyQt6"
DESCRIPTION = "The sip extension module provides support for the PyQt6 package. \
 \
SIP is a tool for automatically generating Python bindings for \
C and C++ libraries. SIP was originally developed in 1998 for \
PyQt - the Python bindings for the Qt GUI toolkit - but is \
suitable for generating bindings for any C or C++ library. SIP \
can also be used write self contained extension modules, i.e. \
without a library to be wrapped."
LICENSE = "BSD-2-Clause"

PV = "13.12.0"

RPM_NAME = "python314-PyQt6-sip-13.12.0-1.1.aarch64.rpm"
RPM_HASH = "64c078fd39506d052a43711403a4b50cc6fadeda24d92bdc7d3ccfede7019645641db7d86eca5fd9e76c128b9f6deaf21ca4bef762adad830640641459ffb840"

RPROVIDES:${PN} += "python3.14dist-pyqt6-sip \
python314-PyQt6-sip \
python3dist-pyqt6-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
