SUMMARY = "Headers and Libraries for building applications using munge"
DESCRIPTION = "A header file and libraries for building applications using the munge \
authenication service."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "0.5.18"

RPM_NAME = "munge-devel-0.5.18-1.4.aarch64.rpm"
RPM_HASH = "6615a3dc26d63b15e69c59dc7bdb836e48a9e43280e7d0e7eee9df934a5b9cc7587aaffa5e32d1b4dc276277e16cb257722241a0edd40dea7b75661e0341296d"

RPROVIDES:${PN} += "munge-devel \
pkgconfig-munge"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmunge2"

inherit rpm
