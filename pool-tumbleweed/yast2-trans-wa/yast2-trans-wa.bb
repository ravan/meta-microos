SUMMARY = "YaST2 - Walloon Translations"
DESCRIPTION = "YaST2 - Translations for Walloon."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20260906.c2bec94659"

RPM_NAME = "yast2-trans-wa-84.87.20260906.c2bec94659-1.1.noarch.rpm"
RPM_HASH = "5cce4ec9eac18291eb4153a55dbba8d1f3d38f26f81a82c349f97254bf36e54aaf67f4409d6ab26907a723b05e2a07cad9d6c92f5c7d59aeeaea7ce979338602"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-wa \
yast2-trans-wa"

RDEPENDS:${PN} += ""

inherit rpm
