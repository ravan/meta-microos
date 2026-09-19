SUMMARY = "Translations for package calls"
DESCRIPTION = "Provides translations for the 'calls' package."
LICENSE = "GPL-3.0-only & MIT"

PV = "50.0"

RPM_NAME = "calls-lang-50.0-1.2.noarch.rpm"
RPM_HASH = "5d68beb33a815f40c9f052989932c302d9d767e7efe1d30d7ebe56ba010e520287a4897da4b1e6594e01569cb46deb060705197a9e4a3e25ae3d31f47272267c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "calls-lang \
calls-lang-all \
locale-calls-ar \
locale-calls-be \
locale-calls-bg \
locale-calls-ca \
locale-calls-cs \
locale-calls-da \
locale-calls-de \
locale-calls-el \
locale-calls-en-GB \
locale-calls-eo \
locale-calls-es \
locale-calls-eu \
locale-calls-fa \
locale-calls-fi \
locale-calls-fr \
locale-calls-fur \
locale-calls-gl \
locale-calls-he \
locale-calls-hi \
locale-calls-hr \
locale-calls-hu \
locale-calls-ia \
locale-calls-id \
locale-calls-it \
locale-calls-ja \
locale-calls-ka \
locale-calls-kk \
locale-calls-ko \
locale-calls-lt \
locale-calls-lv \
locale-calls-nb \
locale-calls-ne \
locale-calls-nl \
locale-calls-nn \
locale-calls-oc \
locale-calls-pa \
locale-calls-pl \
locale-calls-pt \
locale-calls-pt-BR \
locale-calls-ro \
locale-calls-ru \
locale-calls-sk \
locale-calls-sl \
locale-calls-sr \
locale-calls-sr@latin \
locale-calls-sv \
locale-calls-th \
locale-calls-tr \
locale-calls-ug \
locale-calls-uk \
locale-calls-vi \
locale-calls-zh-CN \
locale-calls-zh-TW"

RDEPENDS:${PN} += "calls"

inherit rpm
