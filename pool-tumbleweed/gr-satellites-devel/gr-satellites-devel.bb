SUMMARY = "Development files for gr-satellites"
DESCRIPTION = "Development files for gr-satellites module for GNU Radio."
LICENSE = "Apache-2.0 & GPL-3.0-or-later & LGPL-2.1-or-later & MIT"

PV = "5.9.0"

RPM_NAME = "gr-satellites-devel-5.9.0-1.1.aarch64.rpm"
RPM_HASH = "0b352dcea654f00d75959edbae01b3abf1dea1b54ccf07be0902d7407b44dcb47305604b1885debffa34a5660c7731a2508528ec6166b758d0566256fd0ecc98"

RPROVIDES:${PN} += "cmake-gnuradio-satellites \
cmake-satellites \
gr-satellites-devel"

RDEPENDS:${PN} += "gnuradio-devel \
libgnuradio-satellites5-9-0"

inherit rpm
