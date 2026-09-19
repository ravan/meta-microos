SUMMARY = "YaST Development"
DESCRIPTION = "Tools and libraries for developing YaST modules, the setup and configuration tool for openSUSE."
LICENSE = "MIT"

PV = "20260219"

RPM_NAME = "patterns-yast-devel_yast-20260219-1.2.aarch64.rpm"
RPM_HASH = "e4ef2aea63ee631af2461aefd839892585aad5dc24998464d6b6ca82738b250e16133eb8b2895efd710fc564d7f0cf33bb75b57ddcd4851cb66bcb11874b8372"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-yast-devel-yast"

RDEPENDS:${PN} += ""

inherit rpm
