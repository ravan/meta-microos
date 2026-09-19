SUMMARY = "Use libzypp in RPM_SINGLETRANS mode"
DESCRIPTION = "This package installs a zypp.conf snippet to enable ZYPP_RPM_SINGLETRANS. \
libzypp will then use a single RPM transaction for all package changes, \
instead of one RPM transaction per-package."
LICENSE = "GPL-2.0-or-later"

PV = "4.0+git29"

RPM_NAME = "zypp-single-rpmtrans-4.0+git29-1.1.aarch64.rpm"
RPM_HASH = "edb451d1894ea40afbe2f2e288c7585d5ed796f9eaf61aa78ab8ee315c6c6dc22940a1f4df35ef429174bdf012c5e1c5c7fab47c0033e0b77646dee06009d330"

RPROVIDES:${PN} += "zypp-single-rpmtrans"

RDEPENDS:${PN} += "libzypp-econf"

inherit rpm
