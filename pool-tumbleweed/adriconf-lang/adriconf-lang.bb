SUMMARY = "Translations for package adriconf"
DESCRIPTION = "Provides translations for the 'adriconf' package."
LICENSE = "GPL-3.0-only"

PV = "2.7.4"

RPM_NAME = "adriconf-lang-2.7.4-1.2.noarch.rpm"
RPM_HASH = "3e2d79aa0ea30d7cf7051257ad2ba272739d1b32c0d3091d86388baee0a957902605babf415ddabba96a8877f128b16b390cdebf11fed3fa339588f50f9ec77f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "adriconf-lang \
adriconf-lang-all \
locale-adriconf-en \
locale-adriconf-hr \
locale-adriconf-lv \
locale-adriconf-pl \
locale-adriconf-pt-BR \
locale-adriconf-zh-CN"

RDEPENDS:${PN} += "adriconf"

inherit rpm
