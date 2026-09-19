SUMMARY = "KDE Office"
DESCRIPTION = "KDE Office"
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_office-20260830-1.1.noarch.rpm"
RPM_HASH = "7520a8fd17c9be99342f5366acf0cac327ef58d158e6e7bda93fd6b3b5ee96c8ec02b14c2d8221e59e12996db1f2175388a3e06961c2a4019fa53dc4168a1256"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-office \
patterns-openSUSE-kde-office \
patterns-openSUSE-kde4-office"

RDEPENDS:${PN} += ""

inherit rpm
