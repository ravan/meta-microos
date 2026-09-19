SUMMARY = "Development package for baloo6"
DESCRIPTION = "Baloo is a framework for searching and managing metadata. This \
package contains aditional command line utilities. Development files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "6.30.0"

RPM_NAME = "kf6-baloo-devel-6.30.0-1.1.aarch64.rpm"
RPM_HASH = "42273ffa6e57bd9dacd6d03b3f51fe2f1f71e56abd0d74a73518f9bcf9682d228324713c2007ca5558889b014a73d7f4531a5eee9e5d0d751a70d951273a3f8f"

RPROVIDES:${PN} += "cmake-KF6Baloo \
kf6-baloo-devel \
pkgconfig-KF6Baloo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
cmake-KF6CoreAddons \
cmake-KF6FileMetaData \
cmake-Qt6Core \
libKF6Baloo6 \
libKF6BalooEngine6 \
lmdb-devel \
pkgconfig-Qt6Core"

inherit rpm
