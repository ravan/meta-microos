SUMMARY = "Baekmuk Fonts, TrueType Version"
DESCRIPTION = "Baekmuk Fonts (Korean fonts for the X Window System, True Type \
version)."
LICENSE = "HPND"

PV = "2.2"

RPM_NAME = "baekmuk-ttf-fonts-2.2-2.7.noarch.rpm"
RPM_HASH = "72d098364db76649a2852fa98ea15aac6a96b23c1bc3666accc67689f14d35a14b51ece121fff830aff0411967423f249be97d167222a846e75f6d3da76b1edd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baekmuk-ttf \
baekmuk-ttf-fonts \
config-baekmuk-ttf-fonts \
locale-ko \
scalable-font-ko"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
