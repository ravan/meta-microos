SUMMARY = "The Enlightenment GTK theme -- GTK+ 3 Support"
DESCRIPTION = "The dark GTK2/GTK3 theme with sharp corners, which is designed for use in \
Enlightenment and gives the elegant look of Enlightenment to GTK widgets. \
 \
This package contains the GTK+3 theme."
LICENSE = "GPL-3.0"

PV = "3.22.2"

RPM_NAME = "gtk3-metatheme-e17gtk-3.22.2-1.19.noarch.rpm"
RPM_HASH = "5ab4405c0cc8521d2a6c11192e23f89a8a97f09e4dfbe1ced168f4184c0bd1a469c86a851aa6b316838e54c164c44793d6617533dd6735eb915af3a8ecfb1787"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-e17gtk"

RDEPENDS:${PN} += "gtk3 \
metatheme-e17gtk-common"

inherit rpm
