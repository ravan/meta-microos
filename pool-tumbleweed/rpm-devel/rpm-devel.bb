SUMMARY = "Development files for librpm"
DESCRIPTION = "This package contains the RPM C library and header files.  These \
development files will simplify the process of writing programs which \
manipulate RPM packages and databases and are intended to make it \
easier to create graphical package managers or any other tools that \
need an intimate knowledge of RPM packages in order to function."
LICENSE = "GPL-2.0-or-later"

PV = "4.20.1"

RPM_NAME = "rpm-devel-4.20.1-10.1.aarch64.rpm"
RPM_HASH = "2dc69f32e306ec3789bae16d68b11adae9f7e1f9cd2c28028a2c79aa1d626e546ab21e5c4066f9f6a233169bf097b89a998b91b4cdd20142241e3c4785a7a09b"

RPROVIDES:${PN} += "cmake-rpm \
pkgconfig-rpm \
rpm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-popt \
popt-devel \
rpm"

inherit rpm
