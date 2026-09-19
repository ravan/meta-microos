SUMMARY = "Base theme for the Pagure web interface"
DESCRIPTION = "This package provides the web interface assets for styling \
a Pagure server with the base upstream look and feel."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.14.1"

RPM_NAME = "pagure-theme-upstream-5.14.1-3.3.noarch.rpm"
RPM_HASH = "e0302e079fcfe537b1ee95af6a9bf1feb1de89fea8b8e5d974aa8a10b967034c925822200d6310bc98d50a5519cf492b11c0b124a713ea2126f91423c2062ae1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pagure-theme-upstream"

RDEPENDS:${PN} += "pagure"

inherit rpm
