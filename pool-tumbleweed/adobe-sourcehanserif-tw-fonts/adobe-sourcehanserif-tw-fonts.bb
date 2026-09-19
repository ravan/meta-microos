SUMMARY = "Source Han Serif variation for Traditional Chinese in Taiwan"
DESCRIPTION = "Source Han Serif is a pan-CJK typeface. It is the serif counterpart to Source Han Sans and comes in seven weights."
LICENSE = "OFL-1.1"

PV = "2.003"

RPM_NAME = "adobe-sourcehanserif-tw-fonts-2.003-1.3.noarch.rpm"
RPM_HASH = "cb97fcfd4a79df4b0f557979fa62baaab3dda1ead6884e599ee56111140072f5f701773d8eac838da111101f5f946d953afd904809fb469dbae14b3a4e744556"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adobe-sourcehanserif-fonts \
adobe-sourcehanserif-tw-fonts \
locale-zh-TW \
scalable-font-zh-TW"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
