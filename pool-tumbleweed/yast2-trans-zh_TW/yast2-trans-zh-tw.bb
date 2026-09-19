SUMMARY = "YaST2 - Traditional Chinese Translations"
DESCRIPTION = "YaST2 - Translations for Traditional Chinese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-zh_TW-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "294fc45b46c12945db6196636aa7440897668a15dde3f81eade7937668bfc7a09eb084b99396011cce9aaa9da8acabd3a388b77ead3094e1c12cbd14c544ad45"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-zh-TW \
yast2-trans-zh-TW"

RDEPENDS:${PN} += ""

inherit rpm
