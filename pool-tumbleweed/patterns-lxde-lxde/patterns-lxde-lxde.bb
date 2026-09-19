SUMMARY = "LXDE Desktop Environment"
DESCRIPTION = "LXDE is a lightweight X11 desktop environment similiar to XFCE in its nature."
LICENSE = "MIT"

PV = "20170319"

RPM_NAME = "patterns-lxde-lxde-20170319-3.13.aarch64.rpm"
RPM_HASH = "b400f31d19f7e4508ac24928e3014c3e1f2b13cb626c09cd34eb2a9e86a11cb62ed1e844d0154fbcfff5c3ff572931da9f1c58fae9ada5103b32241dcedbf273"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-lxde-lxde"

RDEPENDS:${PN} += "pattern-"

inherit rpm
