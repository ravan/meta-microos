SUMMARY = "YaST2 - Spanish (Argentina) Translations"
DESCRIPTION = "YaST2 - Spanish (Argentina) Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-es_AR-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "2043d06986a06eb68a02dc29f70146de8ee3cb43d1f1e4a48b89c58342741680f433a68e8b0be4a892cd43ff6d527e70252102c2283bba8c481c9617520df9ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-es-AR \
yast2-trans-es-AR"

RDEPENDS:${PN} += ""

inherit rpm
