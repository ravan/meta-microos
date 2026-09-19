SUMMARY = "Source Han Serif variation for Japanese"
DESCRIPTION = "Source Han Serif is a pan-CJK typeface. It is the serif counterpart to Source Han Sans and comes in seven weights."
LICENSE = "OFL-1.1"

PV = "2.003"

RPM_NAME = "adobe-sourcehanserif-jp-fonts-2.003-1.3.noarch.rpm"
RPM_HASH = "b9cfe89bb7831044e04b557ad4d681f944684f8f7cc3f5bcc066dd698306ce39a5bb83f4dbb8b6b669ffa6fd45890a95b2e6f41f28548b792b24d9a31acbceb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehanserif-jp-fonts \
locale-jp \
scalable-font-jp"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
