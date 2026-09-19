SUMMARY = "YaST2 - Bulgarian Translations"
DESCRIPTION = "YaST2 - Translations for Bulgarian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-bg-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "a3875b89916e5c7fd69f14e8af1bf9d90974a01126e7d53d2ce6d92f5c7ce754f0bd53e28cc74d2e4e65ade410fff705f08baf0a93590c98415b2dccae3abd71"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bg \
yast2-trans-bg"

RDEPENDS:${PN} += ""

inherit rpm
