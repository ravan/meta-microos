SUMMARY = "YaST2 - Vietnamese Translations"
DESCRIPTION = "YaST2 - Translations for Vietnamese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-vi-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "c9592581c9ac43763195116d64ff85f833df10954e0201125bb7a8f598ff93346de1683cde3d9fc0d6705f05335447f001efff0ff03a01f57998883e6b8688d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-vi \
yast2-trans-vi"

RDEPENDS:${PN} += ""

inherit rpm
