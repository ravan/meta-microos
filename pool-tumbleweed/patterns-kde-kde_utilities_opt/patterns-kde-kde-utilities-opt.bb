SUMMARY = "KDE Utilities (Additional)"
DESCRIPTION = "KDE Application - Additional Utilities"
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_utilities_opt-20260830-1.1.noarch.rpm"
RPM_HASH = "6dbe5f142545fff2cd5a47c6b0adac899079bef44a6bb770dc79cffb0797ee0827ce5c9153933874416caa9f02aa49624f1d5d3e286f4940a11fc8a3e9e08fd4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-utilities-opt \
patterns-openSUSE-kde-utilities-opt \
patterns-openSUSE-kde4-utilities-opt"

RDEPENDS:${PN} += ""

inherit rpm
