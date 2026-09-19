SUMMARY = "Package providing R-core packages R-compiler"
DESCRIPTION = "This package provides R-compiler, one of the R-core packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "4.6.1"

RPM_NAME = "R-compiler-4.6.1-58.3.aarch64.rpm"
RPM_HASH = "c0bf14b818739168f86e22625d019399253ebda9cbab58c57e902039e022af30b706bf0b55395a19f2cfc8967d508437fd9ef53f6f259c9a24577a59bf239ff7"

RPROVIDES:${PN} += "R-compiler"

RDEPENDS:${PN} += "R-base"

inherit rpm
