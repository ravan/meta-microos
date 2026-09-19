SUMMARY = "KDE Frameworks and Plasma Development"
DESCRIPTION = "KDE Frameworks development packages."
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-devel_kde_frameworks-20260830-1.1.noarch.rpm"
RPM_HASH = "f56d3cf3a8eee7188f636587a3bc90e322307b2224534a52ebc2a9a28356022409644b3c7d292f83ec6258fb361140186ed3e37b2628feb2b448c3581150b464"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-devel-kde \
patterns-kde-devel-kde-frameworks \
patterns-openSUSE-devel-kde \
patterns-openSUSE-devel-kde-framework"

RDEPENDS:${PN} += "pattern-"

inherit rpm
