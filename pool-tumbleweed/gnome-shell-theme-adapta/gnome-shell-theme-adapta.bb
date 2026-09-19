SUMMARY = "Adapta GNOME Shell themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the GNOME Shell themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "gnome-shell-theme-adapta-3.95.0.11-5.4.noarch.rpm"
RPM_HASH = "ddb4739aeba48eea529a58031d69c17b23c84fe931bea66ba02eb32d4db10436395d5c60d9db1b9d6c00722213993178b78b83e77f82376dc2b142c58f29538e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-shell-theme-adapta"

RDEPENDS:${PN} += "gnome-shell \
metatheme-adapta-common"

inherit rpm
