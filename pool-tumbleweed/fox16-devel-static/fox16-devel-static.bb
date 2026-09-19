SUMMARY = "Static Libraries for the FOX Toolkit 1.6"
DESCRIPTION = "This package contains static libraries for developing applications \
which are statically linked against the FOX libraries. \
 \
FOX is a C++-based library for graphical user interface development."
LICENSE = "LGPL-2.1-or-later"

PV = "1.6.57"

RPM_NAME = "fox16-devel-static-1.6.57-4.14.aarch64.rpm"
RPM_HASH = "a1618f14e8e612b4d61d52787ef1f816effa627471eb90d75f85c693c37228fa93edc5101b718b82bad0140396f28b4757287af1046db0cbe093d145cd84db03"

RPROVIDES:${PN} += "fox16-devel-static \
fox16-static"

RDEPENDS:${PN} += "fox16-devel"

inherit rpm
