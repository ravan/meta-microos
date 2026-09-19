SUMMARY = "Dracula Xfwm4 themes"
DESCRIPTION = "This package contains the Xfwm4 support for for Dracula theme."
LICENSE = "GPL-3.0-only"

PV = "4.0.0+git146.2618a03"

RPM_NAME = "xfwm4-theme-dracula-4.0.0+git146.2618a03-1.2.noarch.rpm"
RPM_HASH = "e05f970d98c2d44a35b99674025401c4251eb41586f7528c4002a8ea3bb013d404291cc3aeb543f1860b97a6c25ebcbb9aab137a063fa5b14b5337d31ce30bac"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dracula-gtk-theme \
xfwm4-theme-dracula"

RDEPENDS:${PN} += "metatheme-dracula-common \
xfwm4"

inherit rpm
