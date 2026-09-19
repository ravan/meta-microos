SUMMARY = "GTK+, Xfwm4 and Metacity Sonar Theme"
DESCRIPTION = "GTK+, Xfwm4 and Metacity theme created for openSUSE 11.2."
LICENSE = "GPL-2.0-or-later"

PV = "11.3.0"

RPM_NAME = "gtk2-metatheme-sonar-11.3.0-31.9.noarch.rpm"
RPM_HASH = "d49bf1788d15dfd2615b7dd0448a506ec509a35fc54bfaf63a3e159c251dcfc923a09e1f22e0850fc5ee0b1350cb5d54d61fcf1ba0b3cf8e1dc3525ed30248e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-sonar"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-sonar-common"

inherit rpm
