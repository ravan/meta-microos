SUMMARY = "YaST2 - German Translations"
DESCRIPTION = "YaST2 - German translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-de-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "11f4cf3952d574a178ada9615c424abd82e13887602996ba6c554e7bbe7bb48f706fb9e1966434fd22172a1f7ec2125e30a39da9f1eeb50bcefc6a9216cdfbaf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-de \
yast2-trans-de"

RDEPENDS:${PN} += ""

inherit rpm
