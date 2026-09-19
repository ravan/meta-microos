SUMMARY = "KDE Plasma 6 Desktop Base"
DESCRIPTION = "Base packages for the KDE Plasma 6 desktop environment."
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_plasma-20260830-1.1.noarch.rpm"
RPM_HASH = "4c6b10552ff6d5c35265bd2c166fe202e8b87335633ea06d6bdcddf62c1892ccb5d279f67f9a65aa20521626780d06d2897b0e189447117d2dbcbc204da381e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-kde-plasma \
patterns-kde-kde-plasma6"

RDEPENDS:${PN} += "aurorae6 \
desktop-data \
kf6-qqc2-desktop-style \
pattern- \
plasma6-session \
polkit-default-privs"

inherit rpm
