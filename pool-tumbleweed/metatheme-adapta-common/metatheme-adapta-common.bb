SUMMARY = "Adapta common theme files"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains common files for all Adapta themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "metatheme-adapta-common-3.95.0.11-5.4.noarch.rpm"
RPM_HASH = "9466906fd05a2f1c7e264d4e7d318802224eb9cb564a7c2c3552581801aaf327bb36627966594397a0a216eb88721761af6861651a68114ea6e8f605d18ed06b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adapta-gtk-theme \
metatheme-adapta-common"

RDEPENDS:${PN} += "google-roboto-fonts \
noto-sans-fonts"

inherit rpm
