SUMMARY = "KDE Frameworks 6 and Plasma 6 Development"
DESCRIPTION = "KDE Frameworks 6 and Plasma 6 development packages."
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-devel_kde_frameworks6-20260830-1.1.noarch.rpm"
RPM_HASH = "619e5e5ee9e6dced64811f548ca38534279f43a3f8c96842b84bf74c4fcbc2d796c5880a079502e601d183a585e28d759430d4c292e7a39059bc44710235b47a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-devel-kde-frameworks6"

RDEPENDS:${PN} += "pattern-"

inherit rpm
