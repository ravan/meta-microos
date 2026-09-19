SUMMARY = "Translations for package pspp"
DESCRIPTION = "Provides translations for the 'pspp' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.1.1"

RPM_NAME = "pspp-lang-2.1.1-2.2.noarch.rpm"
RPM_HASH = "c31deafc75f2fd0dc147cbdabf6776beae6e6527c7781ef282999831d708d1c34e88b689c5276e6fae1fc8d482c622ba1f8923ad622fec39d15c40657bcf307c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-pspp-ar \
locale-pspp-ca \
locale-pspp-cs \
locale-pspp-de \
locale-pspp-el \
locale-pspp-es \
locale-pspp-fr \
locale-pspp-gl \
locale-pspp-hu \
locale-pspp-ja \
locale-pspp-ka \
locale-pspp-lt \
locale-pspp-nl \
locale-pspp-pl \
locale-pspp-pt-BR \
locale-pspp-ro \
locale-pspp-ru \
locale-pspp-sl \
locale-pspp-sv \
locale-pspp-ta \
locale-pspp-th \
locale-pspp-tr \
locale-pspp-uk \
locale-pspp-zh-CN \
pspp-lang \
pspp-lang-all"

RDEPENDS:${PN} += "pspp"

inherit rpm
