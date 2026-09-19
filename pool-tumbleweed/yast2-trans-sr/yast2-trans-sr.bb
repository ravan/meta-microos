SUMMARY = "YaST2 - Serbian Translations"
DESCRIPTION = "YaST2 - Translations for Serbian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-sr-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "81647ff1812473214ae6a3008b382d22fcbf078716c9b28c616920859a9a4be64667410fff086232bf925ee55bc35d8731e6fcaef75fc3803b344fdab47a080b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-sr \
yast2-trans-sr"

RDEPENDS:${PN} += ""

inherit rpm
