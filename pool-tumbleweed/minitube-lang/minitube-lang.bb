SUMMARY = "Translations for package minitube"
DESCRIPTION = "Provides translations for the 'minitube' package."
LICENSE = "GPL-3.0-or-later"

PV = "4.0"

RPM_NAME = "minitube-lang-4.0-1.1.noarch.rpm"
RPM_HASH = "b8ad5de52214a624b7a69b9baeeeff27b69701ab6542b3b7173584ab70446b55a30f803236a00719ab7b5f13465014e219be7a47bbb9f7f272efe96edf8572b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "minitube-lang \
minitube-lang-all"

RDEPENDS:${PN} += "minitube"

inherit rpm
