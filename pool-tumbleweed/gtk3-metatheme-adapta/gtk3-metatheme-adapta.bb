SUMMARY = "Adapta GTK+3 themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the GTK3+ themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "gtk3-metatheme-adapta-3.95.0.11-5.4.noarch.rpm"
RPM_HASH = "d8250e0b657a4462a57a882458e70ec753c663b1d12df40c14dd132285df08d85757818594893815566b6753c51f17314ed5349ad2c4c849926d60f286bd1eb4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-adapta"

RDEPENDS:${PN} += "gtk3 \
metatheme-adapta-common"

inherit rpm
