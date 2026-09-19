SUMMARY = "YaST2 - Ukrainian Translations"
DESCRIPTION = "YaST2 - Translations for Ukrainian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-uk-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "2081f8773227ea99bccf8a93efe254e75383ed3fd8685acb2f053fdfc101761640c68fe7b399ba40a25cdf6ee2d67082673d496c0e76673fd46a148595723219"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-uk \
yast2-trans-uk"

RDEPENDS:${PN} += ""

inherit rpm
