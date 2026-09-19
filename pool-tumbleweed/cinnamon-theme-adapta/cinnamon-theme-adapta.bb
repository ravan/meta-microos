SUMMARY = "Adapta Cinnamon themes"
DESCRIPTION = "Adapta is a GTK+ theme based on Material Design Guidelines that was \
created based on the Flat-Plat theme. \
 \
This package contains the cinnamon themes."
LICENSE = "CC-BY-SA-4.0 & GPL-2.0-only"

PV = "3.95.0.11"

RPM_NAME = "cinnamon-theme-adapta-3.95.0.11-5.4.noarch.rpm"
RPM_HASH = "d5b644dc735e5a29a35716202e1fa1c3c737dd0b0e302e4fbe7ca8fcc0945292cfb16bfce0798087c74335d244e8f21d216683c92dbb186d9fc0405e5b185a69"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-theme-adapta"

RDEPENDS:${PN} += "cinnamon \
metatheme-adapta-common"

inherit rpm
