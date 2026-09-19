SUMMARY = "Development Files for Vc"
DESCRIPTION = "Vc is a free software library to ease explicit vectorization of C++ code. It \
has an intuitive API and provides portability between different compilers and \
compiler versions as well as portability between different vector instruction \
sets. \
 \
This package provides development headers needed to build software using Vc."
LICENSE = "BSD-3-Clause"

PV = "1.4.5"

RPM_NAME = "Vc-devel-1.4.5-1.10.aarch64.rpm"
RPM_HASH = "f8e2a3cc6e734ced39b07b604b1778630ab68af03fd1ad0e42e3b33653c59cf42d88522e16133a8490edac5a552299c6b3449e67706575119e01944614fc148c"

RPROVIDES:${PN} += "Vc-devel \
cmake-Vc"

RDEPENDS:${PN} += "Vc-devel-static"

inherit rpm
