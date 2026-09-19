SUMMARY = "Numix GTK+2 Theme"
DESCRIPTION = "Numix is a modern flat theme with a combination of light and dark \
elements. It supports MATE, GNOME, Xfce, and Openbox. \
This package contains the GTK+2 theme."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.7.1617863126.0d6b4c8"

RPM_NAME = "gtk2-metatheme-numix-2.6.7.1617863126.0d6b4c8-4.2.noarch.rpm"
RPM_HASH = "5ff3e44bc08a5eabbdbf1fa2347f44f814112680a21f28cdd683cf069df36b0afc1662d811e8e0c2929f1ad4b201406e24158a3a0bd0bff6a642bbc4dd7491ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-numix"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-numix-common"

inherit rpm
