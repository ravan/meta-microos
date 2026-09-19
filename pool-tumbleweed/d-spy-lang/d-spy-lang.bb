SUMMARY = "Translations for package d-spy"
DESCRIPTION = "Provides translations for the 'd-spy' package."
LICENSE = "GPL-3.0-or-later & LGPL-3.0-or-later"

PV = "50.0"

RPM_NAME = "d-spy-lang-50.0-1.3.noarch.rpm"
RPM_HASH = "3281dfb8da716962e16aa24022ecaaa2579ed7467fc268aa13f3d91fcdc06fe6001ea8e60466ceba33157e73b1db9b1291066a07b944f368700e8cc9442b8b76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "d-spy-lang \
d-spy-lang-all \
locale-d-spy-az \
locale-d-spy-be \
locale-d-spy-bg \
locale-d-spy-ca \
locale-d-spy-cs \
locale-d-spy-da \
locale-d-spy-de \
locale-d-spy-el \
locale-d-spy-en-GB \
locale-d-spy-eo \
locale-d-spy-es \
locale-d-spy-eu \
locale-d-spy-fa \
locale-d-spy-fi \
locale-d-spy-fr \
locale-d-spy-fur \
locale-d-spy-gl \
locale-d-spy-he \
locale-d-spy-hi \
locale-d-spy-hu \
locale-d-spy-ia \
locale-d-spy-id \
locale-d-spy-it \
locale-d-spy-ka \
locale-d-spy-kk \
locale-d-spy-ko \
locale-d-spy-lt \
locale-d-spy-lv \
locale-d-spy-nb \
locale-d-spy-ne \
locale-d-spy-nl \
locale-d-spy-oc \
locale-d-spy-pl \
locale-d-spy-pt \
locale-d-spy-pt-BR \
locale-d-spy-ro \
locale-d-spy-ru \
locale-d-spy-sk \
locale-d-spy-sl \
locale-d-spy-sr \
locale-d-spy-sr@latin \
locale-d-spy-sv \
locale-d-spy-th \
locale-d-spy-tr \
locale-d-spy-ug \
locale-d-spy-uk \
locale-d-spy-zh-CN \
locale-d-spy-zh-TW"

RDEPENDS:${PN} += "d-spy"

inherit rpm
