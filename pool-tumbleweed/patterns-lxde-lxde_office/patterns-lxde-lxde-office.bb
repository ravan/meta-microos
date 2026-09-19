SUMMARY = "LXDE Office"
DESCRIPTION = "LXDE Office"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-lxde-lxde_office-20170319-3.13.aarch64.rpm"
RPM_HASH = "bb06e9e1e008e48ae4920c9647eb90bdbea0968aa211cce380c9dcaa2519467fc93f4c70f4e056d3f863d3efe7eefebd4e4598885d4aa27e442053d21230fedb"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-lxde-lxde-office"

RDEPENDS:${PN} += "pattern-"

inherit rpm
