SUMMARY = "Yuyo Gtk Theme -- GTK+ 2 Support"
DESCRIPTION = "Yuyo has light and dark variations and a flat style with crisp \
clean lines."
LICENSE = "GPL-3.0+"

PV = "0.3"

RPM_NAME = "gtk2-metatheme-yuyo-0.3-1.24.noarch.rpm"
RPM_HASH = "304c051854afcb27648fa21e51fb5a7a4882d120339fdf247d77fca2b55fc8d844feb2a8a99aeb1c5294b7eddb4a7680f96b6a39f654da61d8b774129cc2139b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-yuyo"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-yuyo-common"

inherit rpm
