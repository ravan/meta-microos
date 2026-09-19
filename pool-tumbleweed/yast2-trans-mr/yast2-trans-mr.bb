SUMMARY = "YaST2 - Marathi Translations"
DESCRIPTION = "YaST2 - Translations for Marathi."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-mr-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "4622fa01d047e95255aba1a6d6b9dc4f7ae46b6800d2d0af5daf88e57d2f1ec15cdb0481eeb40557b876b21c753da4c3233b287ba859488449f99a5ce715038c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-mr \
yast2-trans-mr"

RDEPENDS:${PN} += ""

inherit rpm
