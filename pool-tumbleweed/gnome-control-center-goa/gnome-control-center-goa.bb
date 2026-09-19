SUMMARY = "Configuration panel for online accounts"
DESCRIPTION = "This package provides the online accounts onfiguration panel for \
GNOME control center."
LICENSE = "GPL-2.0-or-later"

PV = "50.4"

RPM_NAME = "gnome-control-center-goa-50.4-1.1.noarch.rpm"
RPM_HASH = "ebcc9bf52689210ee2a199e69df2f83605f160ebb27d9b98f8d5c55013b1f44a3700e2c70fe6e002f26b6953244b4d5ea221075574b837331bb95496c97f9eaa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-control-center-goa"

RDEPENDS:${PN} += "gnome-control-center \
gnome-online-accounts"

inherit rpm
