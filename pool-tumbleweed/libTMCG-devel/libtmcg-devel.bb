SUMMARY = "Libraries and headers to develop with libTMCG library"
DESCRIPTION = "Libraries and headers to develop with the libTMCG library."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.18"

RPM_NAME = "libTMCG-devel-1.3.18-1.28.aarch64.rpm"
RPM_HASH = "1d84770a67781fd74921088af89ecb09768086f19899a0ee431b2ecf45bf07f3db3e5b33fb7a6dd725e0458be69d17586720bd17def9ff9495df348e173b28a3"

RPROVIDES:${PN} += "libTMCG-devel"

RDEPENDS:${PN} += "/usr/bin/sh \
libTMCG18"

inherit rpm
