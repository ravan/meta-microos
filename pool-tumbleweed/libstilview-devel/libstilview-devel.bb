SUMMARY = "Development files for libstilview"
DESCRIPTION = "This package contains headers and libraries required to build applications that \
use libstilview."
LICENSE = "GPL-2.0-or-later"

PV = "3.1.1"

RPM_NAME = "libstilview-devel-3.1.1-1.1.aarch64.rpm"
RPM_HASH = "f006b43750944d1c6cb9e25d06b22cb24bbe798ddff154f3114cbffbcd51112bb97885e202ce9322500c857b17901bdf5bfb064607a002b88d38e9257d40d9de"

RPROVIDES:${PN} += "libstilview-devel \
pkgconfig-libstilview"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libstilview0"

inherit rpm
