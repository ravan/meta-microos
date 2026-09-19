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

PV = "3.10.21"

RPM_NAME = "python310-devel-3.10.21-1.1.aarch64.rpm"
RPM_HASH = "9e6146fc701c6e6545dd9770bdfc8a6b6fae7d7c5e06ed5e3384e41188bf4f583daa7b90cc639f996e69cf86334f9bb46f4b2f42e4b47a4ed075a14177545e69"

RPROVIDES:${PN} += "pkgconfig-python-3.10 \
pkgconfig-python-3.10-embed \
python310-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-base"

inherit rpm
