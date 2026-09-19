SUMMARY = "leechcraft_browser"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_browser-20170319-1.24.aarch64.rpm"
RPM_HASH = "0aa3b12bec49b2cb542506cce74cc3d2742d8be10160a7164b5d346e14dc6bd90ff88a8745410713481f700ac077f0bec8c859c34743b75df8578e1df9de56b7"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-leechcraft-leechcraft-browser"

RDEPENDS:${PN} += "leechcraft-cstp \
leechcraft-poshuku \
pattern-"

inherit rpm
