SUMMARY = "Translations for package phpMyAdmin"
DESCRIPTION = "Provides translations for the 'phpMyAdmin' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.2.3"

RPM_NAME = "phpMyAdmin-lang-5.2.3-1.3.noarch.rpm"
RPM_HASH = "f0e61a66e3ad44c041d9d5e15f680ecc412dae11aceb103e4628f07d717cf59eac38c6ad34aa52b6d9b5c3b0a4f4fe33a243b223bb413ff18ccfb6107cc5b059"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-phpMyAdmin-af \
locale-phpMyAdmin-ar \
locale-phpMyAdmin-ast \
locale-phpMyAdmin-az \
locale-phpMyAdmin-be \
locale-phpMyAdmin-be@latin \
locale-phpMyAdmin-bg \
locale-phpMyAdmin-bn \
locale-phpMyAdmin-br \
locale-phpMyAdmin-brx \
locale-phpMyAdmin-bs \
locale-phpMyAdmin-ca \
locale-phpMyAdmin-ckb \
locale-phpMyAdmin-cs \
locale-phpMyAdmin-cy \
locale-phpMyAdmin-da \
locale-phpMyAdmin-de \
locale-phpMyAdmin-el \
locale-phpMyAdmin-en-GB \
locale-phpMyAdmin-eo \
locale-phpMyAdmin-es \
locale-phpMyAdmin-et \
locale-phpMyAdmin-eu \
locale-phpMyAdmin-fa \
locale-phpMyAdmin-fi \
locale-phpMyAdmin-fr \
locale-phpMyAdmin-fy \
locale-phpMyAdmin-gl \
locale-phpMyAdmin-gu \
locale-phpMyAdmin-he \
locale-phpMyAdmin-hi \
locale-phpMyAdmin-hr \
locale-phpMyAdmin-hu \
locale-phpMyAdmin-hy \
locale-phpMyAdmin-ia \
locale-phpMyAdmin-id \
locale-phpMyAdmin-it \
locale-phpMyAdmin-ja \
locale-phpMyAdmin-ka \
locale-phpMyAdmin-kk \
locale-phpMyAdmin-km \
locale-phpMyAdmin-kmr \
locale-phpMyAdmin-kn \
locale-phpMyAdmin-ko \
locale-phpMyAdmin-ksh \
locale-phpMyAdmin-ky \
locale-phpMyAdmin-li \
locale-phpMyAdmin-lt \
locale-phpMyAdmin-lv \
locale-phpMyAdmin-mk \
locale-phpMyAdmin-ml \
locale-phpMyAdmin-mn \
locale-phpMyAdmin-ms \
locale-phpMyAdmin-nb \
locale-phpMyAdmin-ne \
locale-phpMyAdmin-nl \
locale-phpMyAdmin-pa \
locale-phpMyAdmin-pl \
locale-phpMyAdmin-pt \
locale-phpMyAdmin-pt-BR \
locale-phpMyAdmin-rcf \
locale-phpMyAdmin-ro \
locale-phpMyAdmin-ru \
locale-phpMyAdmin-si \
locale-phpMyAdmin-sk \
locale-phpMyAdmin-sl \
locale-phpMyAdmin-sq \
locale-phpMyAdmin-sr \
locale-phpMyAdmin-sr@latin \
locale-phpMyAdmin-sv \
locale-phpMyAdmin-ta \
locale-phpMyAdmin-te \
locale-phpMyAdmin-th \
locale-phpMyAdmin-tk \
locale-phpMyAdmin-tr \
locale-phpMyAdmin-tt \
locale-phpMyAdmin-ug \
locale-phpMyAdmin-uk \
locale-phpMyAdmin-ur \
locale-phpMyAdmin-uz \
locale-phpMyAdmin-uz@latin \
locale-phpMyAdmin-vi \
locale-phpMyAdmin-vls \
locale-phpMyAdmin-zh-CN \
locale-phpMyAdmin-zh-TW \
phpMyAdmin-lang \
phpMyAdmin-lang-all"

RDEPENDS:${PN} += "phpMyAdmin"

inherit rpm
