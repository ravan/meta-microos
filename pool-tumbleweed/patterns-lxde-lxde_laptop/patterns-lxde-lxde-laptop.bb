SUMMARY = "LXDE Laptop"
DESCRIPTION = "LXDE Tools designed specifically for use with laptop computers."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-lxde-lxde_laptop-20170319-3.13.aarch64.rpm"
RPM_HASH = "75490060ce135e1c61d8b22e2026a94843e6825ec70e35c06a6392009a54b1b8c820950ab3ad56a48874818b961f302109040a14383191bf10761e8926adca94"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-lxde-lxde-laptop"

RDEPENDS:${PN} += "pattern-"

inherit rpm
