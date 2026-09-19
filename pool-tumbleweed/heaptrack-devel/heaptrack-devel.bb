SUMMARY = "Development files for the Heaptrack API"
DESCRIPTION = "This package contains files needed to develop for the Heaptrack \
API."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5.0"

RPM_NAME = "heaptrack-devel-1.5.0-6.8.aarch64.rpm"
RPM_HASH = "b5a0784c8ae2bfc0f5d8b1a2f3708abbb73929cb8866687a3a27e2f42b72f54352d89249f131691b5f18554e3fae7736a3b851b4679b70d206dde5dc0bf84625"

RPROVIDES:${PN} += "heaptrack-devel"

RDEPENDS:${PN} += "heaptrack"

inherit rpm
