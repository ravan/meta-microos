SUMMARY = "YaST2 - Polish Translations"
DESCRIPTION = "YaST2 - Translations for Polish."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-pl-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "df0e41a68f22b6b59a9ff73ee86b99db782e873a15e06df365dc943579cca092696b09bba1846c577106b2612f52741b02a8e00c09904c9c7eb94ad2a375e9d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-pl \
yast2-trans-pl"

RDEPENDS:${PN} += ""

inherit rpm
