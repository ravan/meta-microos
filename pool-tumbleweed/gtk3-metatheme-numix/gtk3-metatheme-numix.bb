SUMMARY = "Numix GTK+3 Theme"
DESCRIPTION = "Numix is a modern flat theme with a combination of light and dark \
elements. It supports MATE, GNOME, Xfce, and Openbox. \
This package contains the GTK+3 theme."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.7.1617863126.0d6b4c8"

RPM_NAME = "gtk3-metatheme-numix-2.6.7.1617863126.0d6b4c8-4.2.noarch.rpm"
RPM_HASH = "241dcab28be14bfa289b5169f8cd4d527e681c8cf276cd8005ef3817a82ac2ad5c770c4f5518b1c1eea1eb15f515c7e5117c28f71c772ce82cfe221af24f5cc9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-numix"

RDEPENDS:${PN} += "gtk3 \
metatheme-numix-common"

inherit rpm
