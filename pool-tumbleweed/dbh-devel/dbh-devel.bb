SUMMARY = "Development files for the Disk-Based Hash Library"
DESCRIPTION = "Disk-based hashes is a method to create multidimensional binary trees \
on disk. This library permits the extension of the database concept to \
a plethora of electronic data, such as graphic information. With the \
multidimensional binary tree, it is possible to mathematically prove \
that access time to any particular record is minimized (using the \
concept of critical points from calculus), which provides the means to \
construct optimized databases for particular applications."
LICENSE = "GPL-2.0-or-later"

PV = "5.0.22"

RPM_NAME = "dbh-devel-5.0.22-2.8.aarch64.rpm"
RPM_HASH = "8bdb196f28d5bb6b2afd822180a51d99a5f815ffcc314e1e90ccc0c993ca03c085362b68985bc0c40ca15baac7554dfdd1a20809f270a160698e795cc96e1d76"

RPROVIDES:${PN} += "dbh-devel \
pkgconfig-dbh2"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libdbh2"

inherit rpm
