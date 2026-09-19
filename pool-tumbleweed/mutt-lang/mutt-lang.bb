SUMMARY = "Languages for Mutt"
DESCRIPTION = "Provides translations to the package mutt."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.2"

RPM_NAME = "mutt-lang-2.4.2-1.1.noarch.rpm"
RPM_HASH = "156ace162943b95feeb88dee51de1fc16862e91c6d65cc66507496b867130f9e47e17ce53842e41eabdcdec97b203d352ac45d83df42e371d90393f079cf543c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-mutt-bg \
locale-mutt-ca \
locale-mutt-cs \
locale-mutt-da \
locale-mutt-de \
locale-mutt-el \
locale-mutt-eo \
locale-mutt-es \
locale-mutt-et \
locale-mutt-eu \
locale-mutt-fi \
locale-mutt-fr \
locale-mutt-ga \
locale-mutt-gl \
locale-mutt-hu \
locale-mutt-id \
locale-mutt-it \
locale-mutt-ja \
locale-mutt-ko \
locale-mutt-lt \
locale-mutt-nl \
locale-mutt-pl \
locale-mutt-pt-BR \
locale-mutt-ru \
locale-mutt-sk \
locale-mutt-sv \
locale-mutt-tr \
locale-mutt-uk \
locale-mutt-zh-CN \
locale-mutt-zh-TW \
mutt-/usr/share/locale/en-GB/LC-MESSAGES/mutt.mo \
mutt-lang"

RDEPENDS:${PN} += "mutt"

inherit rpm
