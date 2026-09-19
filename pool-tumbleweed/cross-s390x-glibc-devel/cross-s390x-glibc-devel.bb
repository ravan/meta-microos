SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.44"

RPM_NAME = "cross-s390x-glibc-devel-2.44-2.1.noarch.rpm"
RPM_HASH = "bff0c6f8bd3b48cbe771f536f55abac8320c725a5dbf0dc5e3fc9ab50b38a327ac1ffeb4aa65e91b2cec7a1d587609263dc1e4ee52f304907cd2dd5eecc349fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-s390x-glibc-devel"

RDEPENDS:${PN} += "cross-s390x-linux-glibc-devel"

inherit rpm
