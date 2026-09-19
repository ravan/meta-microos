SUMMARY = "A Library for Posting Electronic Mail"
DESCRIPTION = "libESMTP is a library to manage posting (or submission of) electronic \
mail using SMTP to a preconfigured Mail Transport Agent (MTA). \
 \
This subpackage contains the API definition files."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.1.0"

RPM_NAME = "libesmtp-devel-1.1.0-3.7.aarch64.rpm"
RPM_HASH = "decdd3f841734b143dcfb9ee73f76ddabbc471a4ab184ca1cbe159262a2d294cd2e4e61d76188fd9bb8d2fe1b03b5d53b14571e7879157faedc7651a95c44093"

RPROVIDES:${PN} += "libesmtp-devel \
pkgconfig-libesmtp-1.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libesmtp6-2-0 \
pkgconfig-openssl"

inherit rpm
