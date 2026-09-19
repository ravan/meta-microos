SUMMARY = "Translations for package seahorse"
DESCRIPTION = "Provides translations for the 'seahorse' package."
LICENSE = "GFDL-1.1-only & GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "47.0.1+6"

RPM_NAME = "seahorse-lang-47.0.1+6-3.4.noarch.rpm"
RPM_HASH = "0dff0438fa4691f836d39d844751c76e6f45530849324ac314f5db1fc314a5f626e0f7d1729d30e44ba8200b33846385fda541bab6777ddf2d4cf35f15d8f2b2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-seahorse-ar \
locale-seahorse-as \
locale-seahorse-ast \
locale-seahorse-az \
locale-seahorse-be \
locale-seahorse-be@latin \
locale-seahorse-bg \
locale-seahorse-bn \
locale-seahorse-bn-IN \
locale-seahorse-br \
locale-seahorse-bs \
locale-seahorse-ca \
locale-seahorse-ca@valencia \
locale-seahorse-cs \
locale-seahorse-cy \
locale-seahorse-da \
locale-seahorse-de \
locale-seahorse-dz \
locale-seahorse-el \
locale-seahorse-en-CA \
locale-seahorse-en-GB \
locale-seahorse-en@shaw \
locale-seahorse-eo \
locale-seahorse-es \
locale-seahorse-et \
locale-seahorse-eu \
locale-seahorse-fa \
locale-seahorse-fi \
locale-seahorse-fr \
locale-seahorse-fur \
locale-seahorse-ga \
locale-seahorse-gd \
locale-seahorse-gl \
locale-seahorse-gu \
locale-seahorse-he \
locale-seahorse-hi \
locale-seahorse-hr \
locale-seahorse-hu \
locale-seahorse-id \
locale-seahorse-is \
locale-seahorse-it \
locale-seahorse-ja \
locale-seahorse-ka \
locale-seahorse-kk \
locale-seahorse-kn \
locale-seahorse-ko \
locale-seahorse-lt \
locale-seahorse-lv \
locale-seahorse-mai \
locale-seahorse-mk \
locale-seahorse-ml \
locale-seahorse-mr \
locale-seahorse-ms \
locale-seahorse-nb \
locale-seahorse-ne \
locale-seahorse-nl \
locale-seahorse-nn \
locale-seahorse-oc \
locale-seahorse-or \
locale-seahorse-pa \
locale-seahorse-pl \
locale-seahorse-pt \
locale-seahorse-pt-BR \
locale-seahorse-ro \
locale-seahorse-ru \
locale-seahorse-si \
locale-seahorse-sk \
locale-seahorse-sl \
locale-seahorse-sq \
locale-seahorse-sr \
locale-seahorse-sr@latin \
locale-seahorse-sv \
locale-seahorse-ta \
locale-seahorse-te \
locale-seahorse-th \
locale-seahorse-tr \
locale-seahorse-ug \
locale-seahorse-uk \
locale-seahorse-vi \
locale-seahorse-zh-CN \
locale-seahorse-zh-HK \
locale-seahorse-zh-TW \
seahorse-lang \
seahorse-lang-all"

RDEPENDS:${PN} += "seahorse"

inherit rpm
