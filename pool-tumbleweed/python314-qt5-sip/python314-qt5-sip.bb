SUMMARY = "The sip module support for PyQt5"
DESCRIPTION = "The sip extension module provides support for the PyQt5 package. \
 \
SIP is a tool that makes it very easy to create Python bindings for \
C and C++ libraries. It was originally developed to create PyQt, \
the Python bindings for the Qt toolkit, but can be used to create \
bindings for any C or C++ library. For example, it is also used to \
create wxPython, the Python bindings for the wxWidget toolkit."
LICENSE = "BSD-2-Clause"

PV = "12.16.1"

RPM_NAME = "python314-qt5-sip-12.16.1-2.7.aarch64.rpm"
RPM_HASH = "11039dbb2c389373a2679831f5f4c37d0cde9e028d2b4a19393bb7b2d27cd73f066e6a913689140dd5eaa770f4a92501eeca60eb93a896eb03805983b464a015"

RPROVIDES:${PN} += "python3.14dist-pyqt5-sip \
python314-PyQt5-sip \
python314-qt5-sip \
python3dist-pyqt5-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
