SUMMARY = "YaST Base Utilities"
DESCRIPTION = "YaST tools for basic system administration."
LICENSE = "MIT"

PV = "20260219"

RPM_NAME = "patterns-yast-yast2_basis-20260219-1.2.aarch64.rpm"
RPM_HASH = "c94f06379956e1bb122569b0bde962d837e404efb89decef8464c4ecc64a9d75aa4a3b593a21ac57ebd6ca22bb71138afea6c6cf3fd730ed17becaa77d5dac05"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-yast-yast2-basis"

RDEPENDS:${PN} += "libyui-ncurses-pkg \
yast2 \
yast2-alternatives \
yast2-firewall \
yast2-packager \
yast2-theme"

inherit rpm
