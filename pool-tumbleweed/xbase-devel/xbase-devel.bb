SUMMARY = "Developmnet files for XBase Compatible C++ Class Library"
DESCRIPTION = "This is an XBase (dBase and FoxPro, for example) compatible C++ class \
library. \
 \
This package contains header files and development files."
LICENSE = "LGPL-2.1+"

PV = "3.1.2"

RPM_NAME = "xbase-devel-3.1.2-1.36.aarch64.rpm"
RPM_HASH = "961215d3d14a1fe4d39b8a6ef00cd079a5fe5085676e4335824c9f4151797b6c7e7e78c1204699ceb24594532885a1cc44514c1193adc14168bc4eb6080643d7"

RPROVIDES:${PN} += "xbase-devel \
xbase64-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libstdc++-devel \
xbase"

inherit rpm
