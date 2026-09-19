SUMMARY = "Data files for sar2"
DESCRIPTION = "Data files for Search and Rescue II"
LICENSE = "GPL-2.0-only"

PV = "2.6.0"

RPM_NAME = "sar2-data-2.6.0-2.4.noarch.rpm"
RPM_HASH = "113cdf015125be25313d0909921f11bd8a79b388883997f1adc5ec9c84c3ad18f8134113d29010b89d39c2cc0ca9bfb317f6ca7dad6f991f18c97718ccbd75b9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "sar2-data"

RDEPENDS:${PN} += "sar2"

inherit rpm
