SUMMARY = "Numix Common Theme Files"
DESCRIPTION = "Numix is a modern flat theme with a combination of light and dark \
elements. It supports MATE, GNOME, Xfce, and Openbox. \
This package contains common files and themes for Marco, Openbox, \
and Xfwm4."
LICENSE = "GPL-3.0-or-later"

PV = "2.6.7.1617863126.0d6b4c8"

RPM_NAME = "metatheme-numix-common-2.6.7.1617863126.0d6b4c8-4.2.noarch.rpm"
RPM_HASH = "af61e9f993bfab4bc468bd323c5ede5b0c804082cbf605b26218578a34048bc36dc8c28180568a9beaa9f9347426cc907de89b165bcde50e6baeeb43fe7fbcab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-numix-common"

RDEPENDS:${PN} += ""

inherit rpm
