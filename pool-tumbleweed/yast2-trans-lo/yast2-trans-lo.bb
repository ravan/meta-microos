SUMMARY = "YaST2 - Lao Translations"
DESCRIPTION = "YaST2 - Translations for Lao."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-lo-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "fcf5ddfd6dd9dae6f73bd572ad140f549dd07d38f13dde31a76b6328f2658a19e9b900394dc5897e44fa9153dd02ca38e1b271e49c82a4b81aa75009de9fa7bb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-lo \
yast2-trans-lo"

RDEPENDS:${PN} += ""

inherit rpm
