SUMMARY = "YaST2 - Kannada Translations"
DESCRIPTION = "YaST2 - Translations for Kannada."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-kn-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "58c92a09e39a66e3d0f93f8287b104622326fc7607f0f0741c700c948d3b595a881c0a9de70358c81da65434c85d9ab4c73d37fb7633e0917a89332066519ddf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ka \
yast2-trans-kn"

RDEPENDS:${PN} += ""

inherit rpm
