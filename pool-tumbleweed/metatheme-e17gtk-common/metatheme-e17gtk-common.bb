SUMMARY = "The Enlightenment GTK theme -- Common Files"
DESCRIPTION = "The dark GTK2/GTK3 theme with sharp corners, which is designed for use in \
Enlightenment and gives the elegant look of Enlightenment to GTK widgets. \
 \
This package provides the common files to the GTK+ themes."
LICENSE = "GPL-3.0"

PV = "3.22.2"

RPM_NAME = "metatheme-e17gtk-common-3.22.2-1.19.noarch.rpm"
RPM_HASH = "9171fcc2cb58068bfbc905f0640d75cf28d38c50598c83a4af249c8d4251019d641b06c4293b1cb0885d8e8b20d3cf26d63543a285fbc6ce9f3f6015892a34fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-e17gtk-common"

RDEPENDS:${PN} += ""

inherit rpm
