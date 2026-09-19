SUMMARY = "Development files for GNU Mailutils"
DESCRIPTION = "This package includes libraries and header files for building tools to \
access mailutils features."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "3.21"

RPM_NAME = "mailutils-devel-3.21-1.6.aarch64.rpm"
RPM_HASH = "eae2ddaf0b196430de76c7ef3ee36697cd3db20a8d578ce9850c81e69b54ae4665c07164dd7b8570d9924c153b3e310ecbfb7e1ac8e5e103f99cb3117cdb8e9c"

RPROVIDES:${PN} += "mailutils-devel"

RDEPENDS:${PN} += "libmailutils9 \
mailutils"

inherit rpm
