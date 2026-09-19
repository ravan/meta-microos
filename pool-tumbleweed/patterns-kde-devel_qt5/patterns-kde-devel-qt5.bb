SUMMARY = "Qt 5 Development"
DESCRIPTION = "Tools and libraries for software development using Qt 5."
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-devel_qt5-20260830-1.1.noarch.rpm"
RPM_HASH = "f39a7c494cd5d4518910e92bb642c14770a462b74ec56abcc41ac97eb5f823f2b639fb675049908fbe5d7efd7bbe9718a7d58802fd90c780eeb53954b2d49d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-devel-qt5 \
patterns-openSUSE-devel-qt5"

RDEPENDS:${PN} += "libqt5-qtbase-common-devel \
pattern-"

inherit rpm
