SUMMARY = "Development documents of fprintd"
DESCRIPTION = "This package contains Development documents for fprintd"
LICENSE = "GPL-2.0-or-later"

PV = "1.94.5"

RPM_NAME = "fprintd-doc-1.94.5-1.4.noarch.rpm"
RPM_HASH = "7eefc1f7800daf5dca26b2041d86a0e151d2baf52a343f6d8ac347a71d384c25e618e0641a24e9588c55b8c38afa854b81ca964fd7d0b51596f21e096b9908bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fprintd-doc"

RDEPENDS:${PN} += "fprintd"

inherit rpm
