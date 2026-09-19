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

RPM_NAME = "python313-PyQt6-sip-13.12.0-1.1.aarch64.rpm"
RPM_HASH = "b506d77f8dc906de67a458521647871477ca3edcd37f99bc06046dd88bd785fff1530bdc238c7520f90e63bd67e08078928c3d9adbbdb9941fd5e90d17a99508"

RPROVIDES:${PN} += "python3-PyQt6-sip \
python3.13dist-pyqt6-sip \
python313-PyQt6-sip \
python3dist-pyqt6-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
