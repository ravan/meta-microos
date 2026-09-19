SUMMARY = "Include files needed for development with FreeTDS"
DESCRIPTION = "The freetds-devel package contains the files necessary for development with \
the FreeTDS libraries."
LICENSE = "LGPL-2.1-or-later"

PV = "1.4.27"

RPM_NAME = "freetds-devel-1.4.27-2.1.aarch64.rpm"
RPM_HASH = "707db616466c355767b79730ac88aecd570cccb79d7194030acbe2eb00a673570df716a93347acfc1b343e72bf4c5ff8662f64dc1f20020537a38a6dba7e024e"

RPROVIDES:${PN} += "freetds-devel"

RDEPENDS:${PN} += "libct4 \
libsybdb5 \
libtdsodbc0"

inherit rpm
