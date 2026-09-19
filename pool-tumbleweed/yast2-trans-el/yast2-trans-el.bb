SUMMARY = "YaST2 - Greek Translations"
DESCRIPTION = "YaST2 - Translations for Greek."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-el-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "2bae8752c2bd0aa8c77c8454fe29c41b83224ae563daf8cabcbac89ecbf644a431636eae7af4912b9f103a04284d9efdcf7663e66308fb16ba4382ffbedeead5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-el \
yast2-trans-el"

RDEPENDS:${PN} += ""

inherit rpm
