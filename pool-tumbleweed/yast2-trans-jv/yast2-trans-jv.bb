SUMMARY = "YaST2 - Javanese Translations"
DESCRIPTION = "YaST2 - Translations for Javanese."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-jv-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "caaedb5472dd7b5b2d34a73d688c88ea4f1f28663f27b464484147003dcd76e14e56cca3308b4050fa17dbf615578f09b977d4e4241292a295b2fbca90e959a8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-jv \
yast2-trans-jv"

RDEPENDS:${PN} += ""

inherit rpm
