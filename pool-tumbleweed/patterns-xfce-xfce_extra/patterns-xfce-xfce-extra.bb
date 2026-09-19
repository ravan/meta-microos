SUMMARY = "XFCE Extra Applications"
DESCRIPTION = "Extra packages for the XFCE Desktop Environment"
LICENSE = "MIT"

PV = "20230212"

RPM_NAME = "patterns-xfce-xfce_extra-20230212-12.3.aarch64.rpm"
RPM_HASH = "2ca6997ed2fc92fbf68b7285e3e05930cbfd6a6e4fd51e9701e2b9919f0ee05c62408cc13d4171aa6da36fa333f9e043cf62cee7a285c717900ecbcfbde575ab"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-openSUSE-xfce-extra \
patterns-openSUSE-xfce-office \
patterns-xfce-xfce-extra \
patterns-xfce-xfce-office"

RDEPENDS:${PN} += "pattern-"

inherit rpm
