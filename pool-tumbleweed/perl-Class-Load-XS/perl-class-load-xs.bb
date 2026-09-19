SUMMARY = "XS implementation of parts of Class::Load"
DESCRIPTION = "This module provides an XS implementation for portions of Class::Load. See \
Class::Load for API details."
LICENSE = "Artistic-2.0"

PV = "0.10"

RPM_NAME = "perl-Class-Load-XS-0.10-1.50.aarch64.rpm"
RPM_HASH = "291320cbed6264eb761147fac02ae7dced0d89aaa435300c77ba7d928b305dc8e42aa5609c2d8bde9dcbcf2ead7fa44fc760b86ea6966400ceae9bfb32321362"

RPROVIDES:${PN} += "perl-Class--Load--XS \
perl-Class-Load-XS"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
perl--MODULE-COMPAT-5.44.0 \
perl-Class--Load"

inherit rpm
