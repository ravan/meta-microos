SUMMARY = "Development libraries, header files and utilities for omniORB"
DESCRIPTION = "omniORB-devel contains the omniORB development files. These \
files are needed to develop applications based on omniORB."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.3.2"

RPM_NAME = "omniORB-devel-4.3.2-1.10.aarch64.rpm"
RPM_HASH = "06ba97bbd07b0987ae76beaf0e7e05f4aa02b4e20b4ebf475bb9bdfbd5972328205a15ba1b515bf8b18a9d4fcb9dbccc03965216df804718bd64eb15b0193b1e"

RPROVIDES:${PN} += "omniORB-devel \
pkgconfig-omniCOS4 \
pkgconfig-omniCOSDynamic4 \
pkgconfig-omniConnectionMgmt4 \
pkgconfig-omniDynamic4 \
pkgconfig-omniORB4 \
pkgconfig-omniZIOP4 \
pkgconfig-omniZIOPDynamic4 \
pkgconfig-omnithread3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libomniORB4-3 \
libomnithread4 \
omniORB \
pkgconfig-omniCOS4 \
pkgconfig-omniORB4 \
pkgconfig-omniZIOP4 \
pkgconfig-omnithread3"

inherit rpm
