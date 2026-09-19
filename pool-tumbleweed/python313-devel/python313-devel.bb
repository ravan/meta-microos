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

PV = "3.13.14"

RPM_NAME = "python313-devel-3.13.14-2.1.aarch64.rpm"
RPM_HASH = "9c2218e867b094fb3d23afdef739c2398b49fedf1bafad2a22e0b1ee5be480f658c851ef9831977952cd0b161252f799e7c9ef1e2eeb7c72f729b0ed5f76080c"

RPROVIDES:${PN} += "libpython3.so \
pkgconfig-python-3.13 \
pkgconfig-python-3.13-embed \
pkgconfig-python3 \
pkgconfig-python3-embed \
python3-devel \
python313-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3 \
/usr/bin/python3.13 \
/usr/bin/sh \
libc.so.6 \
libpython3.13.so.1.0 \
python-abi \
python313-base"

inherit rpm
