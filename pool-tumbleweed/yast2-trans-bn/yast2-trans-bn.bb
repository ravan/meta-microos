SUMMARY = "YaST2 - Bengali Translations"
DESCRIPTION = "YaST2 - Translations for Bengali."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-bn-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "5e380a1ef0bb24a5ff8341b5812a3ebdb4bbc589a81d865452ba6d29d025c83a30de98be966d02f61698a53ed462751605ee9cacf70c0cc8a3bf225abf7bd4bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-bn \
yast2-trans-bn"

RDEPENDS:${PN} += ""

inherit rpm
