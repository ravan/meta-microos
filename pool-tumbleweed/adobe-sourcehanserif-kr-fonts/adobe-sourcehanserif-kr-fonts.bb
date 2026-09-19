SUMMARY = "Source Han Serif variation for Korean"
DESCRIPTION = "Source Han Serif is a pan-CJK typeface. It is the serif counterpart to Source Han Sans and comes in seven weights."
LICENSE = "OFL-1.1"

PV = "2.003"

RPM_NAME = "adobe-sourcehanserif-kr-fonts-2.003-1.3.noarch.rpm"
RPM_HASH = "08a8cee2cd60d721e4325086eb3e6de530ed1f6071fd69b0ce961f2c599e2f7fd2e824a183a62cbeb73c1ee2af5729244bfefa28e70f2683f61dd360be9091cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehanserif-kr-fonts \
locale-kr \
scalable-font-kr"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
