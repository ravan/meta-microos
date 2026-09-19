SUMMARY = "Development files for Qt version of Zint library"
DESCRIPTION = "C library and header files needed to develop applications that use libQZint."
LICENSE = "GPL-3.0-or-later"

PV = "2.16.0"

RPM_NAME = "libQZint-devel-2.16.0-2.1.aarch64.rpm"
RPM_HASH = "846bc368621ff7aa295c655a246a9c24caaafe23665d1f83c13f7aa4df098d30bc9c5e271926e2ebbe217f1e4f299aac3e8f1833c684e9eb33788655a3aa39fe"

RPROVIDES:${PN} += "libQZint-devel"

RDEPENDS:${PN} += "libQZint2-16 \
libzint-devel"

inherit rpm
