SUMMARY = "Translations for package kunifiedpush"
DESCRIPTION = "Provides translations for the 'kunifiedpush' package."
LICENSE = "LGPL-2.0-or-later"

PV = "26.08.1"

RPM_NAME = "kunifiedpush-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "7a8ed131a5e4f5193c116bedd686d001499121861eb7d3d9475053a0b19406840e3df98ee1ab4382d9d45ee04e0fc09d86a3296864f075c6904ba582b9db9084"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kunifiedpush-lang \
kunifiedpush-lang-all \
locale-kunifiedpush-ar \
locale-kunifiedpush-ast \
locale-kunifiedpush-bg \
locale-kunifiedpush-ca \
locale-kunifiedpush-ca@valencia \
locale-kunifiedpush-cs \
locale-kunifiedpush-de \
locale-kunifiedpush-en-GB \
locale-kunifiedpush-eo \
locale-kunifiedpush-es \
locale-kunifiedpush-eu \
locale-kunifiedpush-fi \
locale-kunifiedpush-fr \
locale-kunifiedpush-ga \
locale-kunifiedpush-gl \
locale-kunifiedpush-he \
locale-kunifiedpush-hi \
locale-kunifiedpush-hu \
locale-kunifiedpush-ia \
locale-kunifiedpush-it \
locale-kunifiedpush-ja \
locale-kunifiedpush-ka \
locale-kunifiedpush-ko \
locale-kunifiedpush-lt \
locale-kunifiedpush-lv \
locale-kunifiedpush-nl \
locale-kunifiedpush-nn \
locale-kunifiedpush-pa \
locale-kunifiedpush-pl \
locale-kunifiedpush-pt \
locale-kunifiedpush-pt-BR \
locale-kunifiedpush-ro \
locale-kunifiedpush-ru \
locale-kunifiedpush-sk \
locale-kunifiedpush-sl \
locale-kunifiedpush-sv \
locale-kunifiedpush-ta \
locale-kunifiedpush-tr \
locale-kunifiedpush-ug \
locale-kunifiedpush-uk \
locale-kunifiedpush-zh-CN \
locale-kunifiedpush-zh-TW"

RDEPENDS:${PN} += "kunifiedpush"

inherit rpm
