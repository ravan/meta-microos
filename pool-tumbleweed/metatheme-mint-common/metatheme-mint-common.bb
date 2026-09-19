SUMMARY = "Mint Themes -- Common Files"
DESCRIPTION = "A collection of Mint GTK+ themes."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.3"

RPM_NAME = "metatheme-mint-common-2.2.3-1.4.noarch.rpm"
RPM_HASH = "fd84fbc61fd49cdffe029a62143b34b411bffcc0ec1a4152b35181812d52f677d2791b71c35f93dd5d7795dc8a0f0b697c135810027919728d5e7f5ca0f0a6af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-themes \
metatheme-mint-common \
mint-themes"

RDEPENDS:${PN} += ""

inherit rpm
