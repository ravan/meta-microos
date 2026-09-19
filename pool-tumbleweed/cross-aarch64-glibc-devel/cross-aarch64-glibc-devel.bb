SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.34"

RPM_NAME = "cross-aarch64-glibc-devel-2.34-3.1.noarch.rpm"
RPM_HASH = "fb3d16f0d36de7b410c6e8e30db2b66810c34c3efe09ca00b8164d2e74f8c78ac0d9ba1ec57a54bde3e8470d776d40baffbc26024b04350b5c62ec56c15fa09e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-aarch64-glibc-devel"

RDEPENDS:${PN} += "cross-aarch64-linux-glibc-devel"

inherit rpm
