SUMMARY = "Lithuanian (lietuvių) Dictionary for Aspell"
DESCRIPTION = "A Lithuanian ((lietuvių) dictionary for the aspell spell checker."
LICENSE = "BSD-3-Clause"

PV = "1.2.1"

RPM_NAME = "aspell-lt-1.2.1-4.7.aarch64.rpm"
RPM_HASH = "4a52824912708c5e25feffb93627b9cfc050aab3b61c6ff506c83ebd7352e532a90ee786f782d28357c36dd0356534bb7a266e4cf76606f530ae4ee8d981e006"

RPROVIDES:${PN} += "aspell-lt \
locale-aspell-lt"

RDEPENDS:${PN} += ""

inherit rpm
