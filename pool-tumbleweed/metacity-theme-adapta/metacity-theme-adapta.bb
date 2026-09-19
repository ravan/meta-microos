SUMMARY = "Adapta Metacity themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the metacity themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "metacity-theme-adapta-3.95.0.11-5.4.noarch.rpm"
RPM_HASH = "c1ebdb17934e840d540f8d5ac00b8bf66c6e37f69f0e9a5664224fa31688f4555535d23a2071d216c230db6497a001dfb8da56c4b9ad92fcd96b8ad7a5aa03ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metacity-theme-adapta"

RDEPENDS:${PN} += "metacity \
metatheme-adapta-common"

inherit rpm
