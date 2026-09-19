SUMMARY = "Include Files and Libraries Mandatory for Development"
DESCRIPTION = "These libraries are needed to develop programs which use the standard C \
library in a cross compilation setting."
LICENSE = "BSD-3-Clause & LGPL-2.1-or-later & LGPL-2.1-or-later-with-GCC-exception-2.0 & GPL-2.0-or-later"

PV = "2.44"

RPM_NAME = "cross-ppc64le-glibc-devel-2.44-2.1.noarch.rpm"
RPM_HASH = "b25806e1512504b4ee057420678cf693a6184ad07d842ec08b6f6126f623a292c92c2e972bc80b2dfce44e404b7db04ed8aa44c5b9caaffb0dec44448b56902e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cross-ppc64le-glibc-devel"

RDEPENDS:${PN} += "cross-ppc64le-linux-glibc-devel"

inherit rpm
