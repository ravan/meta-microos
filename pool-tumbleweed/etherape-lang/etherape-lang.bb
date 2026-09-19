SUMMARY = "Translations for package etherape"
DESCRIPTION = "Provides translations for the 'etherape' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.9.22"

RPM_NAME = "etherape-lang-0.9.22-1.4.noarch.rpm"
RPM_HASH = "fe8096b95b4d92acbf90a5547b330909cff1ca17e613b97d07a4fc5b72acef55d555b97f53c20843dc3b2be2f3e5156279d33594b7f0b643a1ce3953029f4679"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "etherape-lang \
etherape-lang-all \
locale-etherape-de \
locale-etherape-es \
locale-etherape-fr \
locale-etherape-it \
locale-etherape-ka \
locale-etherape-nl \
locale-etherape-ru \
locale-etherape-sv \
locale-etherape-tr"

RDEPENDS:${PN} += "etherape"

inherit rpm
