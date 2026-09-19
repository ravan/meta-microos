SUMMARY = "MATE Internet"
DESCRIPTION = "MATE Internet Applications."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-mate-mate_internet-20170319-6.3.aarch64.rpm"
RPM_HASH = "bd5b589ac9bf9f4ea97c6c3a89c05c0d235ef898128181604a21a6df5c47e790ec92d540707bd46ee268533676aef30f6a51f416eb048586af1d89902432dd81"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-mate-mate-internet"

RDEPENDS:${PN} += ""

inherit rpm
