SUMMARY = "Dracula GNOME Shell themes"
DESCRIPTION = "This package contains the GNOME Shell support for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "4.0.0+git146.2618a03"

RPM_NAME = "gnome-shell-theme-dracula-4.0.0+git146.2618a03-1.2.noarch.rpm"
RPM_HASH = "8f294d24c685e0ebc27c6aa4eecccacf97109f30b11eb7578ce1395ec568409201e98e6e2387939ac544a594a84427cf72b1465772a7ae2b2537922356524840"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme \
gnome-shell-theme-dracula"

RDEPENDS:${PN} += "gnome-shell \
metatheme-dracula-common"

inherit rpm
