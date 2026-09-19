SUMMARY = "Ambiance Gtk Theme -- GTK+ 3 Support"
DESCRIPTION = "Includes an Ambiance light-on-dark theme. \
 \
Introduced as the default theme in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "gtk3-metatheme-ambiance-20.10-2.10.noarch.rpm"
RPM_HASH = "620c151fa8898d82bcb4040e367726c785c5b08af215836bc6690d6bbadb57d7e665076e88e1b92c0c019a3675b40ac433cd744970aa2f6edb37f29e7ddca711"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-ambiance"

RDEPENDS:${PN} += "gtk3 \
metatheme-ambiance-common"

inherit rpm
