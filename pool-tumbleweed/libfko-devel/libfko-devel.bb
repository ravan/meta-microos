SUMMARY = "The Development Files for the Firewall Knock Operator Library"
DESCRIPTION = "The Firewall Knock Operator library, libfko, provides the Single Packet \
Authorization implementation and API for the other fwknop components. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libfko."
LICENSE = "GPL-2.0-or-later"

PV = "2.6.11"

RPM_NAME = "libfko-devel-2.6.11-1.10.aarch64.rpm"
RPM_HASH = "5b93c136f68ae7a902e2c19c6f7cfb779160e22a8d1e9b51cfbc93e204f6b347033251a5bcd8b0424b8a2e39f80cd00bd25c7a599927c5a452cfb9f42ec8952a"

RPROVIDES:${PN} += "libfko-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libfko3"

inherit rpm
