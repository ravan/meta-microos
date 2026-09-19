SUMMARY = "Games"
DESCRIPTION = "A collection of games."
LICENSE = "MIT"

PV = "20220126"

RPM_NAME = "patterns-games-games-20220126-1.13.aarch64.rpm"
RPM_HASH = "2109e64cf74f3a1bbb0f00b4c67aeb7be1cee0808b01270a46d4776e5d61bd72e03a647b3681bc710d3a1481a82e76c31b4da48782df235afd28d4e229a59d0e"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-games-games"

RDEPENDS:${PN} += "pattern-"

inherit rpm
