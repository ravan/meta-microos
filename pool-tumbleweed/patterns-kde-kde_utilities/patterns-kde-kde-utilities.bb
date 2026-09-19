SUMMARY = "KDE Utilities"
DESCRIPTION = "KDE Applications - Utilities"
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_utilities-20260830-1.1.noarch.rpm"
RPM_HASH = "1230ec99a116b4c00765265308d91e11588fb1656f33e1a1d1ed1c6a1c8bb6d7e82d4c7999a9c77b06b59af1bb1c4a9aca9c874f05f38187c342b7c72adcd4fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-utilities \
patterns-openSUSE-kde-utilities \
patterns-openSUSE-kde4-utilities"

RDEPENDS:${PN} += ""

inherit rpm
