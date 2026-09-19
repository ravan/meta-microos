SUMMARY = "KDE Games"
DESCRIPTION = "KDE Applications - Games"
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_games-20260830-1.1.noarch.rpm"
RPM_HASH = "b743d3b760904d54fc978ad15928edbdf0c8771ac0c7088ac6b75f030e0a2e5fd8ae3bab405b611ac38bf621c0f064dc8b6b07c0140d08f5ff571c27e060d0d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-games \
patterns-openSUSE-kde-games \
patterns-openSUSE-kde4-games"

RDEPENDS:${PN} += ""

inherit rpm
