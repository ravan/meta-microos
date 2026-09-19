SUMMARY = "Ambiance Gtk Theme -- GTK+ 2 Support"
DESCRIPTION = "Includes an Ambiance light-on-dark theme. \
 \
Introduced as the default theme in Ubuntu 10.04 LTS."
LICENSE = "GPL-3.0-or-later"

PV = "20.10"

RPM_NAME = "gtk2-metatheme-ambiance-20.10-2.10.noarch.rpm"
RPM_HASH = "6b12c1de2a3c424ded9945327b660a7fb2d72b4a59010ef8cf0162557ca35e301b0d2ff589374d985ce6aa310b1e4353f87a7e0cd5161edf77695ef4e42a0993"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-ambiance"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-ambiance-common"

inherit rpm
