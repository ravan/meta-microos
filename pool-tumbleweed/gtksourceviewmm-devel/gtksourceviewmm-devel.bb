SUMMARY = "Development files for the gtksourceview C++ interface"
DESCRIPTION = "gtksourceviewmm provides a C++ interface to the gtksourceview library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.91.1"

RPM_NAME = "gtksourceviewmm-devel-3.91.1-1.27.aarch64.rpm"
RPM_HASH = "845840c6f253684b459b0b87bf70bd1e723d53b799f38834c452fc88228880ea71d8b93921f894ce273a2c5bc9a88259329b5d70e47e1bb1385738c02f98367e"

RPROVIDES:${PN} += "gtksourceviewmm-devel \
pkgconfig-gtksourceviewmm-4.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceviewmm-4-0-0 \
pkgconfig-glibmm-2.4 \
pkgconfig-gtkmm-3.0 \
pkgconfig-gtksourceview-4"

inherit rpm
