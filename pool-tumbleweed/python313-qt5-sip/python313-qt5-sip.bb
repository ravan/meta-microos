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

RPM_NAME = "python313-qt5-sip-12.16.1-2.7.aarch64.rpm"
RPM_HASH = "d8544217fbf2553e432af56e71eb12249eae738b62da000f0cb14b46f179221de5fb642922f5a2825a6a34d35ed8c104ec6d8ed72de209009026a82c28dcb94b"

RPROVIDES:${PN} += "python3-PyQt5-sip \
python3-qt5-sip \
python3.13dist-pyqt5-sip \
python313-PyQt5-sip \
python313-qt5-sip \
python3dist-pyqt5-sip"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
python-abi"

inherit rpm
