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

PV = "3.11.16"

RPM_NAME = "python311-devel-3.11.16-1.1.aarch64.rpm"
RPM_HASH = "56ac81ecbd068c658157cc00ccea0f0fa51d5c264c82176b7c090d2cb3c8a9176365ed3032812efb7ac6549935f6d07ce93144ab324de4819fd9ad7a48ad4acd"

RPROVIDES:${PN} += "pkgconfig-python-3.11 \
pkgconfig-python-3.11-embed \
python311-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-base"

inherit rpm
