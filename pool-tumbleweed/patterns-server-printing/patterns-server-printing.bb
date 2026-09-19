SUMMARY = "Print Server"
DESCRIPTION = "This pattern provides all packages necessary for printing. It provides all \
needed packages for printing to a locally connected printer, printing using a \
remote print server and for setting up a print server."
LICENSE = "MIT"

PV = "20250313"

RPM_NAME = "patterns-server-printing-20250313-5.2.aarch64.rpm"
RPM_HASH = "1e5d2f989a3eff24d3c85242f6a0eecc913418bf17d05de919f68b7de18ca42e6c5c8258dc5302f3d5c28add8ae357a4640c60a371a2d8432c4f340fb54e6ed4"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-print-server \
patterns-server-printing"

RDEPENDS:${PN} += "cups \
pattern-"

inherit rpm
