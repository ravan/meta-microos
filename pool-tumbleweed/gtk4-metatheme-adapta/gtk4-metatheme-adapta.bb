SUMMARY = "Adapta GTK+4 themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the GTK+4 themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "gtk4-metatheme-adapta-3.95.0.11-5.4.noarch.rpm"
RPM_HASH = "7ab3c904b3936254d353496508670aa0f81844caed49ebfa012496591421087d7d6691226a41a7a41d6fcd6aa63c94dff8bbd97ab475d4fcd9b4713919168920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk4-metatheme-adapta"

RDEPENDS:${PN} += "gtk4 \
metatheme-adapta-common"

inherit rpm
