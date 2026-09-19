SUMMARY = "YaST2 - Russian Translations"
DESCRIPTION = "YaST2 - Translations for Russian."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-ru-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "cd3b315aa0fe74a4c80fb177efcf13aee67d4aec5c51d71c6f2fd429d51787b4a96d1ef2be9d54ff2514cccd254739834f19bf912baeeb93fb601521857ac083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-ru \
yast2-trans-ru"

RDEPENDS:${PN} += ""

inherit rpm
