SUMMARY = "The old default theme for enlightenment"
DESCRIPTION = "The old default theme for enlightenment, for most of the 2010 Era."
LICENSE = "BSD-2-Clause & LGPL-2.1-only & CC-BY-SA-3.0"

PV = "20220216.1.26"

RPM_NAME = "enlightenment-theme-dark-20220216.1.26-2.2.noarch.rpm"
RPM_HASH = "03e177186340194f0d1f935df61ee469638084251290c8d28d00eb2fdaab334b63ecce6cab3a6ec9881ba6517015f60409de3da6beeb24db0115a1b162b62147"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "enlightenment-theme \
enlightenment-theme-dark"

RDEPENDS:${PN} += ""

inherit rpm
