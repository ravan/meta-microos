SUMMARY = "Include Files and Libraries Mandatory for Building Python Modules"
DESCRIPTION = "The Python programming language's interpreter can be extended with \
dynamically loaded extensions and can be embedded in other programs. \
 \
This package contains header files, a static library, and development \
tools for building Python modules, extending the Python interpreter or \
embedding Python in applications. \
 \
This also includes the Python distutils, which were in the Python \
package up to version 2.2.2."
LICENSE = "Python-2.0"

PV = "3.15.0~rc2"

RPM_NAME = "python315-devel-3.15.0~rc2-1.2.aarch64.rpm"
RPM_HASH = "7d36edcffd7136f0631ea9b22875ddb586d6d8d7a6e0577853a1cd109a1d8d33fc9aed1d5e41b074d3b842ff70baf8eec6b7aa1bf777a08bf9b7dac126d87e58"

RPROVIDES:${PN} += "pkgconfig-python-3.15 \
pkgconfig-python-3.15-embed \
python315-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.15 \
/usr/bin/sh \
gcc \
gcc-c++ \
python-abi \
python315-base"

inherit rpm
