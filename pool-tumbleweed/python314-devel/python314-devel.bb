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

PV = "3.14.7"

RPM_NAME = "python314-devel-3.14.7-1.3.aarch64.rpm"
RPM_HASH = "bc7931e721da62087961f7d404fc4dfa20561a3ab250e539474d75e7231f8abebe9e4cc7a0e99ae84e8d04949eda5004bf8347884ee1e9110078cc6f55939d27"

RPROVIDES:${PN} += "pkgconfig-python-3.14 \
pkgconfig-python-3.14-embed \
python314-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python3.14 \
/usr/bin/sh \
gcc \
gcc-c++ \
python-abi \
python314-base"

inherit rpm
