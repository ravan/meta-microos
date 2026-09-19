SUMMARY = "Translations for package picplanner"
DESCRIPTION = "Provides translations for the 'picplanner' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.4+git4.2ea8588"

RPM_NAME = "picplanner-lang-0.5.4+git4.2ea8588-1.4.noarch.rpm"
RPM_HASH = "a86f9ce4372ed01e499817abed6bef2c4137402d266cc371eb8be7ae8cf56e93ce6e350e6c3ad56dbe8f6a68adcc04db02b9f2012fecfec0b409404e263e9d30"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-picplanner-de \
locale-picplanner-fr \
picplanner-lang \
picplanner-lang-all"

RDEPENDS:${PN} += "picplanner"

inherit rpm
