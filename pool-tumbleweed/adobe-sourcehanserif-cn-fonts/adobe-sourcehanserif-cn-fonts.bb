SUMMARY = "Source Han Serif variation for Simplified Chinese"
DESCRIPTION = "Source Han Serif is a pan-CJK typeface. It is the serif counterpart to Source Han Sans and comes in seven weights."
LICENSE = "OFL-1.1"

PV = "2.003"

RPM_NAME = "adobe-sourcehanserif-cn-fonts-2.003-1.3.noarch.rpm"
RPM_HASH = "58bc9413b84d68117b988448b0ea814f48fa6e84d4450e5387551f0294ed3d30a0834ebe5b71f9e6db94c760205b69850ccece1b0b1feb190732d9a4d0ae0dbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehanserif-cn-fonts \
locale-zh-CN \
scalable-font-zh-CN"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
