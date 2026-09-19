SUMMARY = "Polish (polszczyzna) Dictionary for Aspell"
DESCRIPTION = "A Polish (polszczyzna) dictionary for the aspell spell checker."
LICENSE = "CC-BY-SA-1.0 & GPL-2.0-only & LGPL-2.1-only & MPL-1.1"

PV = "0.60.2015.04.28"

RPM_NAME = "aspell-pl-0.60.2015.04.28-4.7.aarch64.rpm"
RPM_HASH = "54d545087f29c0dca2b7b0fe3963e24bc8535b87d323082cdc4338fa9bb1cfd2b90d5952a8f2a9be40235a41721a8016d19b242b046626e967faeac7aba28318"

RPROVIDES:${PN} += "aspell-pl \
locale-aspell-pl"

RDEPENDS:${PN} += ""

inherit rpm
