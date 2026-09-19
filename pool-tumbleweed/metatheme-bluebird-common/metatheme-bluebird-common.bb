SUMMARY = "A Clean Minimalistic Theme for GNOME, XFCE, GTK+ 2 and 3 -- Common Files"
DESCRIPTION = "The Bluebird theme for GTK2/3 and xfwm4/emerald/metacity started out on the \
basis of Bluebird, but aims at reworking the intense blue tone to a more \
neutral blue-ish look that will be more pleasant to look at in everyday use. \
 \
This package provides the files common to the GTK+ themes and the window \
manager themes as well as background images."
LICENSE = "CC-BY-SA-3.0 | GPL-2.0-or-later"

PV = "1.3"

RPM_NAME = "metatheme-bluebird-common-1.3-3.6.noarch.rpm"
RPM_HASH = "e1feaa153c3ac0edac41e09344f14e038d5d78a71eb4bf549c879613d4b5488c59b237878d33183ce8f49311bce476c0240fcedde9ef21ba95e3a51639e19336"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "metatheme-bluebird-common"

RDEPENDS:${PN} += ""

inherit rpm
