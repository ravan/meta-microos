SUMMARY = "Enlightenment"
DESCRIPTION = "Enlightenment Window Manager and applications"
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-enlightenment-enlightenment-20170319-2.25.aarch64.rpm"
RPM_HASH = "ebd2cf4e75b586cfa68041b88147cc2a5d113f7ec8730fe73e79d5d12a96b7968a8f34b56045fa1a14711e23189199759b3667883734c275993632248b7261ad"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-enlightenment-enlightenment"

RDEPENDS:${PN} += "enlightenment \
lightdm \
pattern-"

inherit rpm
