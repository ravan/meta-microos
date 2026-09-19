SUMMARY = "Mint Themes -- GTK+ 2 Support"
DESCRIPTION = "A collection of Mint GTK+ themes."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.3"

RPM_NAME = "gtk2-metatheme-mint-2.2.3-1.4.noarch.rpm"
RPM_HASH = "6141810f0ce6de56aaa31b777b8530d220a3762d52e14eb24d4f06f60515a5926c611830220fd45dcbd53dfb1d049091bebf6859ff162e941401cc8106807941"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gtk2-metatheme-mint"

RDEPENDS:${PN} += "gtk2-engine-murrine \
metatheme-mint-common"

inherit rpm
