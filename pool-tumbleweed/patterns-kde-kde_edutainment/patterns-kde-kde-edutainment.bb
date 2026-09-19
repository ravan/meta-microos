SUMMARY = "KDE Education"
DESCRIPTION = "KDE Applications - Tools to teach kids with computers"
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_edutainment-20260830-1.1.noarch.rpm"
RPM_HASH = "9778358f6d1e109dc77501d8720d383848cca9529f02d1a584947f5903de5dbb500c3c871ea09898dec44eb3e54eaafe8cb2e2adef0984a7251cb47f88c47e4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-edutainment \
patterns-openSUSE-kde-edutainment \
patterns-openSUSE-kde4-edutainment"

RDEPENDS:${PN} += ""

inherit rpm
