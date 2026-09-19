SUMMARY = "leechcraft_messenger"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-leechcraft-leechcraft_messenger-20170319-1.24.aarch64.rpm"
RPM_HASH = "5ca6e56c46b5c749688e5bf677e73f51143a49c3bc1a93f95c5d6dadcb7849bad6b368d00956c9e834383d6ad9cabbc1a3021b6d5c3db99e6b55fa68e11cb882"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-leechcraft-leechcraft-messenger"

RDEPENDS:${PN} += "leechcraft-azoth \
pattern-"

inherit rpm
