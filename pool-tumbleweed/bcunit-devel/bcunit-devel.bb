SUMMARY = "BCUnit development files"
DESCRIPTION = "BCUnit is a unit testing framework for C. \
This package installs the BCUnit development files."
LICENSE = "LGPL-2.0-or-later"

PV = "5.4.102"

RPM_NAME = "bcunit-devel-5.4.102-1.3.aarch64.rpm"
RPM_HASH = "1fc35620158fa9fa2cc75ec4078ca272089321620ede6afce4b17ba5113418e3e19a21cc139757d621ac14f68869e5d4ce2667469a442c55cff22a1c568d554d"

RPROVIDES:${PN} += "bcunit-devel \
pkgconfig-bcunit"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbcunit1 \
ncurses-devel"

inherit rpm
