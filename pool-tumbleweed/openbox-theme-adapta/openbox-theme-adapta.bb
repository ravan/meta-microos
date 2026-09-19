SUMMARY = "Adapta openbox themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the openbox themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "openbox-theme-adapta-3.95.0.11-5.4.noarch.rpm"
RPM_HASH = "de2c396a6495e7be09547c15de376b98d22b2fbe2ce6dd6ac2ab19cec43f45276a84c2e3094c5beb0a24ae0a694ab46571a0c463a476c1cb33453dfe39475d84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openbox-theme-adapta"

RDEPENDS:${PN} += "metatheme-adapta-common \
openbox"

inherit rpm
