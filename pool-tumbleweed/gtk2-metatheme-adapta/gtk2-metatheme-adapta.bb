SUMMARY = "Adapta GTK+2 themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the GTK2+ themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "gtk2-metatheme-adapta-3.95.0.11-5.4.noarch.rpm"
RPM_HASH = "08877820d874c2c61ad8b752b5576702350d5d47197136d2c10a8772782f43a3278854ed2415819ba5f417909df3555d6be547d7bc98b8f3b5cc358aec03be11"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-adapta"

RDEPENDS:${PN} += "gtk2 \
gtk2-engine-murrine \
metatheme-adapta-common"

inherit rpm
