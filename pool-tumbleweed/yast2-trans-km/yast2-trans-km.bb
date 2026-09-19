SUMMARY = "YaST2 - Khmer Translations"
DESCRIPTION = "YaST2 - Translations for Khmer."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-km-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "454205327670d8e98954f77a62eef51462d079f1d5f04faa6ba8cf32a8f045c83ed72c7ed75cf0fb10ef1c495257b5b4f2373c6dfa44884eb0cdaae62146ea8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-km \
yast2-trans-km"

RDEPENDS:${PN} += ""

inherit rpm
