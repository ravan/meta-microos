SUMMARY = "Translations for package vacuum-im"
DESCRIPTION = "Provides translations for the 'vacuum-im' package."
LICENSE = "GPL-3.0-only"

PV = "1.3.0+git1639054987.g0abd5e1"

RPM_NAME = "vacuum-im-lang-1.3.0+git1639054987.g0abd5e1-1.9.noarch.rpm"
RPM_HASH = "ad87f1da91f0190450ad0f4cee51ab82ba1dde1bcf26e0fd32692b2364a09524b88de169f9d56bb5885f8e82d005dd8504c65d74ef04b35d0381b76669f1a1dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "vacuum-im-lang \
vacuum-im-lang-all"

RDEPENDS:${PN} += "vacuum-im"

inherit rpm
