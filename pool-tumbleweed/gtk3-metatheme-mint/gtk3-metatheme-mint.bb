SUMMARY = "Mint Themes -- GTK+ 3 Support"
DESCRIPTION = "A collection of Mint GTK+ themes."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.3"

RPM_NAME = "gtk3-metatheme-mint-2.2.3-1.4.noarch.rpm"
RPM_HASH = "d8ad943072e3fc38d09f44d175f3c1a374982b4811e19d34891119099173c8fbb502dd2a708a8566198fe489d7cce823efc75201fb251f4aef589eddae7e81d0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-mint \
mint-themes-gtk3"

RDEPENDS:${PN} += "metatheme-mint-common"

inherit rpm
