SUMMARY = "Yuyo Gtk Theme -- GTK+ 3 Support"
DESCRIPTION = "Yuyo has light and dark variations and a flat style with crisp \
clean lines."
LICENSE = "GPL-3.0+"

PV = "0.3"

RPM_NAME = "gtk3-metatheme-yuyo-0.3-1.24.noarch.rpm"
RPM_HASH = "7f7651180d229aeffc527941cc47eeca7698cbc6d56e936ad888022c165b6915adec9f72035667a246e2a89c792c606cc7bdd7546cac1c2e2750f71825de12b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk3-metatheme-yuyo"

RDEPENDS:${PN} += "metatheme-yuyo-common"

inherit rpm
