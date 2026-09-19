SUMMARY = "YaST2 - Esperanto Translations"
DESCRIPTION = "YaST2 - Esperanto Translations."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-eo-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "a257905496b2f95b79cd2cada3492a68f441aeb9dfe2ea5c39f1bcc96395a151641d421b152d3e83f5cd1e22591648c44b479d3780893881cd7876e66fa99ab2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-eo \
yast2-trans-eo"

RDEPENDS:${PN} += ""

inherit rpm
