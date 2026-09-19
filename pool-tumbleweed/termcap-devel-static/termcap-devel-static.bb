SUMMARY = "Development files for termcap"
DESCRIPTION = "This package contains all necessary include files \
and libraries needed to build termcap based applications."
LICENSE = "LGPL-2.1-or-later"

PV = "2.0.8"

RPM_NAME = "termcap-devel-static-2.0.8-1050.6.aarch64.rpm"
RPM_HASH = "304b3f53b75240163b128f3f54d5cf9eacc6c6e08cf833565c3112dfc4da7457a938144c61ab5a8fe21d4a67174d248fbe4f26118de1917657d0e08f6efaea08"

RPROVIDES:${PN} += "termcap-/usr/lib64/termcap/libtermcap.a \
termcap-devel-static"

RDEPENDS:${PN} += "termcap-devel"

inherit rpm
