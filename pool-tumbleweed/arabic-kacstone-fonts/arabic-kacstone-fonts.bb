SUMMARY = "Arabic Kacst One Fonts"
DESCRIPTION = "KacstOne family developed by Kacst institution."
LICENSE = "GPL-2.0-only"

PV = "5.0"

RPM_NAME = "arabic-kacstone-fonts-5.0-18.23.noarch.rpm"
RPM_HASH = "360419baf84aa01b08e29012d510ea18a7c3f103de5e34953c8e78fe0fa1e85114ae771144d69d258b8767c84e0f71aeac42392f8e14947b29f4ab079666e70c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "arabic-kacstone-fonts \
locale-ar"

RDEPENDS:${PN} += ""

inherit rpm
