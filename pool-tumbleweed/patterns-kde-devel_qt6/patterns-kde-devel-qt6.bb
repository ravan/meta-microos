SUMMARY = "Qt 6 Development"
DESCRIPTION = "Tools and libraries for software development using Qt 6."
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-devel_qt6-20260830-1.1.noarch.rpm"
RPM_HASH = "091da8537238484034337479e60f20478e681bd7ea1f9a37781cddeed9e236d5f4789e228bcf7d233ad37d44d33450c96eb4c42e5deacd39006e1d8f6df4e8cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-icon- \
pattern-order- \
pattern-visible- \
patterns-kde-devel-qt6 \
patterns-openSUSE-devel-qt6"

RDEPENDS:${PN} += "pattern- \
qt6-base-common-devel"

inherit rpm
