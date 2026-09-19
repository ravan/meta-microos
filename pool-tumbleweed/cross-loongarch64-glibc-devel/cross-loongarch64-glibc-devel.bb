SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.44"

RPM_NAME = "cross-loongarch64-glibc-devel-2.44-2.1.noarch.rpm"
RPM_HASH = "1d5653ae83c2a7da5bea99e97fbb6bff5437121f08cf31d69e9e2544646127c2b14f7c6975a89dc2296fddde57651a026e602193a00bd03a6e63a5fc707ca45f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-loongarch64-glibc-devel"

RDEPENDS:${PN} += "cross-loongarch64-linux-glibc-devel"

inherit rpm
