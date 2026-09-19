SUMMARY = "Development files for libesedb, a EDB file format library"
DESCRIPTION = "libesedb is a library to access EDB files. ESEDB is used in many different \
applications like Windows Search, Windows Mail, Exchange, Active Directory, etc. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libesedb."
LICENSE = "GFDL-1.1-or-later & LGPL-3.0-or-later & GFDL-1.3-or-later"

PV = "20260704"

RPM_NAME = "libesedb-devel-20260704-1.2.aarch64.rpm"
RPM_HASH = "9c3bd5d70283e60297edf3cbfdae4a499b4ff27a08e552fa598c2416bd9fd05946ea3332c89e12008bfef1750840fb3933af0d9d57691f57e3fe1d52acc6c91d"

RPROVIDES:${PN} += "libesedb-devel \
pkgconfig-libesedb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libesedb1"

inherit rpm
