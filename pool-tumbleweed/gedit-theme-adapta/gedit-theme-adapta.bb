SUMMARY = "Adapta gedit themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains gedit themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "gedit-theme-adapta-3.95.0.11-5.4.noarch.rpm"
RPM_HASH = "45364993850980afbb3142a8335431e875cb28ffcda528830de2e1f3650b87e44da212dc63f6bf075bde19dcfdc31edb468502f0dcc8a31ce9837c1159e1279c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gedit-theme-adapta"

RDEPENDS:${PN} += "gedit \
metatheme-adapta-common"

inherit rpm
