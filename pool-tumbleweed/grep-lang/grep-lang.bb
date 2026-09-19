SUMMARY = "Translations for package grep"
DESCRIPTION = "Provides translations for the 'grep' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.12"

RPM_NAME = "grep-lang-3.12-1.5.noarch.rpm"
RPM_HASH = "b43c5630b91f67632ba30ed98df931c93bb2113a3f724effc91da777c6b2c76c6277d6ca549c8df1acd78f5ff642b2089b93a0cee85a8851f897002921f5ca8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grep-lang \
grep-lang-all \
locale-grep-af \
locale-grep-be \
locale-grep-bg \
locale-grep-ca \
locale-grep-cs \
locale-grep-da \
locale-grep-de \
locale-grep-el \
locale-grep-eo \
locale-grep-es \
locale-grep-et \
locale-grep-eu \
locale-grep-fi \
locale-grep-fr \
locale-grep-ga \
locale-grep-gl \
locale-grep-he \
locale-grep-hr \
locale-grep-hu \
locale-grep-id \
locale-grep-it \
locale-grep-ja \
locale-grep-ka \
locale-grep-ko \
locale-grep-lt \
locale-grep-nb \
locale-grep-nl \
locale-grep-pa \
locale-grep-pl \
locale-grep-pt \
locale-grep-pt-BR \
locale-grep-ro \
locale-grep-ru \
locale-grep-sk \
locale-grep-sl \
locale-grep-sr \
locale-grep-sv \
locale-grep-ta \
locale-grep-th \
locale-grep-tr \
locale-grep-uk \
locale-grep-vi \
locale-grep-zh-CN \
locale-grep-zh-TW"

RDEPENDS:${PN} += "grep"

inherit rpm
