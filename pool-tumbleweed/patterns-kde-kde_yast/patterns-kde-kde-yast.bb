SUMMARY = "YaST KDE User Interfaces"
DESCRIPTION = "Graphical YaST user interfaces for the KDE desktop."
LICENSE = "MIT"

PV = "20260830"

RPM_NAME = "patterns-kde-kde_yast-20260830-1.1.noarch.rpm"
RPM_HASH = "665eb9f6ee8b510f101168e639ab995b54964add80df0ed8f4481861519ba8126221fdde9f78a92e145e601727dfa961cb1ab4705c42cac4110d0957666006ab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pattern- \
pattern-category- \
pattern-extends- \
pattern-icon- \
pattern-order- \
patterns-kde-kde-yast \
patterns-kde-sw-management-kde \
patterns-openSUSE-kde-yast \
patterns-openSUSE-kde4-yast \
patterns-openSUSE-sw-management-kde \
patterns-openSUSE-sw-management-kde4"

RDEPENDS:${PN} += "libyui-qt-pkg \
yast2-control-center-qt"

inherit rpm
