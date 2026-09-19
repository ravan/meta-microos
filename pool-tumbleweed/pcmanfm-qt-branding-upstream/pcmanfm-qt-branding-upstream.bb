SUMMARY = "Upstream branding of pcmanfm-qt"
DESCRIPTION = "This package provides the upstream look and feel for pcmanfm-qt."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "pcmanfm-qt-branding-upstream-2.4.1-1.1.noarch.rpm"
RPM_HASH = "ebf8d2a67722f1144af342c9ca2cb2cd45ab1267d73f8ea87bafad4e8d0b6b94743644db7d3fa23b0c33f4ee740c717f9994d513c3b8b6fca9046939dbfa1e72"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-pcmanfm-qt-branding-upstream \
pcmanfm-qt-branding \
pcmanfm-qt-branding-upstream"

RDEPENDS:${PN} += "kf6-breeze-icons \
pcmanfm-qt"

inherit rpm
