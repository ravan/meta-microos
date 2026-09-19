SUMMARY = "YaST2 - Estonian Translations"
DESCRIPTION = "YaST2 - Translations for Estonian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-et-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "24cff309f84693be3db5908a1153e198c8e42420ed84b644fb19794c9fdff8b40b5c4b3b844504c2ae480eb7fdaf50270f50ec2515c41c6d29cf4e91eca11063"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-et \
yast2-trans-et"

RDEPENDS:${PN} += ""

inherit rpm
