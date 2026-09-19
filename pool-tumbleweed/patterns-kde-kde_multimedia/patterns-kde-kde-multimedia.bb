SUMMARY = "KDE Multimedia"
DESCRIPTION = "KDE Applications - Multimedia"
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_multimedia-20260830-1.1.noarch.rpm"
RPM_HASH = "c858af5753c9a637d5726a1958bf95bf34987f15fc7812c143cdb89038b7631935cafd0db3118faddfbc5543ba07deeb17c0546196bdcb0cc62267bebf3e4a95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-multimedia \
patterns-openSUSE-kde-multimedia \
patterns-openSUSE-kde4-multimedia"

RDEPENDS:${PN} += ""

inherit rpm
