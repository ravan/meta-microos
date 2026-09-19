SUMMARY = "Translations for package switcheroo"
DESCRIPTION = "Provides translations for the 'switcheroo' package."
LICENSE = "GPL-3.0-only"

PV = "2.5.1"

RPM_NAME = "switcheroo-lang-2.5.1-1.7.noarch.rpm"
RPM_HASH = "43f5e6a16051dad88eb5bc1b05a5e9c8aaa4cd949a6e592ac4f42ca110258d45a2edf212b7adbcaea31e146c6ee2e453c1ee43d988eb895298927454368d8e77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-switcheroo-ar \
locale-switcheroo-bg \
locale-switcheroo-cs \
locale-switcheroo-de \
locale-switcheroo-es \
locale-switcheroo-fr \
locale-switcheroo-hi \
locale-switcheroo-hr \
locale-switcheroo-it \
locale-switcheroo-nl \
locale-switcheroo-oc \
locale-switcheroo-pt \
locale-switcheroo-pt-BR \
locale-switcheroo-ru \
locale-switcheroo-sv \
locale-switcheroo-tr \
switcheroo-lang \
switcheroo-lang-all"

RDEPENDS:${PN} += "switcheroo"

inherit rpm
