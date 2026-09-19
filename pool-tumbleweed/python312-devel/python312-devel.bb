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

PV = "3.12.14"

RPM_NAME = "python312-devel-3.12.14-1.1.aarch64.rpm"
RPM_HASH = "f4dd069c38b316892bfe50b9ce3b604f8f36e32aa7535b545d1710e9b978d8a20027f9602fadc89d0116853635e0718042636552b0f7c7413fd36e2b0c723036"

RPROVIDES:${PN} += "pkgconfig-python-3.12 \
pkgconfig-python-3.12-embed \
python312-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.12 \
/usr/bin/sh \
python-abi \
python312-base"

inherit rpm
