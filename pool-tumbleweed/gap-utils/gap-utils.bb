SUMMARY = "GAP: Utility functions in GAP"
DESCRIPTION = "The Utils package provides a collection of utility functions gleaned \
from many packages."
LICENSE = "GPL-2.0-or-later"

PV = "0.99"

RPM_NAME = "gap-utils-0.99-1.1.noarch.rpm"
RPM_HASH = "3279ab9f12fd7ae2b00b649a26f185254fce399552fb44f45024119dfff6c0cc77b3168c6a3e6165bad93b29d1502e13153e8f97ef187f2e509df287c7419761"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gap-utils"

RDEPENDS:${PN} += "gap-core"

inherit rpm
