SUMMARY = "Libraries and Header Files to Develop Programs with ldb2 Support"
DESCRIPTION = "LDB is an LDAP-like embedded database. \
 \
Libraries and Header Files to Develop Programs with ldb2 Support."
LICENSE = "GPL-3.0-or-later"

PV = "4.24.6+git.488.e38f6c96c62"

RPM_NAME = "libldb-devel-4.24.6+git.488.e38f6c96c62-1.1.aarch64.rpm"
RPM_HASH = "a306a5c10b923b8566c7f22dcd33c31baad47a53a5602a03fc08231205ae01a7dceed042fd35393b9f74a4b2101831cb243019fe0e8401f1e97ac37343df6642"

RPROVIDES:${PN} += "libldb-devel \
pkgconfig-ldb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libldb2 \
pkg-config \
pkgconfig-talloc \
pkgconfig-tdb"

inherit rpm
