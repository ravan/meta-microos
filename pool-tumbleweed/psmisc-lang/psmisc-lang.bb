SUMMARY = "Translations for package psmisc"
DESCRIPTION = "Provides translations for the 'psmisc' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.7"

RPM_NAME = "psmisc-lang-23.7-5.5.noarch.rpm"
RPM_HASH = "aa7bb85461c140aefeecfa4b49e6284456ba10f750cd209a34e521ab338914304162141c91ff963883fd9647d323cb70b3a9a797f24f231435d9268f3e3a61df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-psmisc-bg \
locale-psmisc-ca \
locale-psmisc-cs \
locale-psmisc-da \
locale-psmisc-de \
locale-psmisc-el \
locale-psmisc-eo \
locale-psmisc-es \
locale-psmisc-eu \
locale-psmisc-fi \
locale-psmisc-fr \
locale-psmisc-hr \
locale-psmisc-hu \
locale-psmisc-id \
locale-psmisc-it \
locale-psmisc-ja \
locale-psmisc-ka \
locale-psmisc-ko \
locale-psmisc-nb \
locale-psmisc-nl \
locale-psmisc-pl \
locale-psmisc-pt \
locale-psmisc-pt-BR \
locale-psmisc-ro \
locale-psmisc-ru \
locale-psmisc-sr \
locale-psmisc-sv \
locale-psmisc-uk \
locale-psmisc-vi \
locale-psmisc-zh-CN \
locale-psmisc-zh-TW \
psmisc-lang \
psmisc-lang-all"

RDEPENDS:${PN} += "psmisc"

inherit rpm
