SUMMARY = "The Enlightenment GTK theme -- GTK+ 2 Support"
DESCRIPTION = "The dark GTK2/GTK3 theme with sharp corners, which is designed for use in \
Enlightenment and gives the elegant look of Enlightenment to GTK widgets. \
 \
This package contains the GTK+2 theme."
LICENSE = "GPL-3.0"

PV = "3.22.2"

RPM_NAME = "gtk2-metatheme-e17gtk-3.22.2-1.19.noarch.rpm"
RPM_HASH = "f2f737775106b437d758a939f182aece53d8d59720440daadec3d9f154539a2bc2bf907869440db6bdb9fd87c948f84e315a8ae79099d7a175bc534a2f0c20c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-e17gtk"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-e17gtk-common"

inherit rpm
