SUMMARY = "Adapta Plank themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the Plank themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "plank-theme-adapta-3.95.0.11-3.1.noarch.rpm"
RPM_HASH = "906b44659f07734cd87b3441d897f6dd5aa2b655719f9ea98746b940b98f1100b9565c2edd3f76b48a58e979460c6059d5b9582aeb637e1af2b9bd7d7a8fdfbe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "plank-theme-adapta"

RDEPENDS:${PN} += "metatheme-adapta-common \
plank"

inherit rpm
