SUMMARY = "Translations for package libksieve"
DESCRIPTION = "Provides translations for the 'libksieve' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "26.08.1"

RPM_NAME = "libksieve-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "b35dee65f30b80ca7cce7a777263ab41069b155e9ab06739292a2dda20de168c3f9a262dc8c93d6c2f2caf42f397878955dedc4814b4d46fdb099e0abd35d3b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libksieve-lang \
libksieve-lang-all \
locale-libksieve-ar \
locale-libksieve-ast \
locale-libksieve-be \
locale-libksieve-bg \
locale-libksieve-br \
locale-libksieve-bs \
locale-libksieve-ca \
locale-libksieve-ca@valencia \
locale-libksieve-cs \
locale-libksieve-cy \
locale-libksieve-da \
locale-libksieve-de \
locale-libksieve-el \
locale-libksieve-en-GB \
locale-libksieve-eo \
locale-libksieve-es \
locale-libksieve-et \
locale-libksieve-eu \
locale-libksieve-fa \
locale-libksieve-fi \
locale-libksieve-fr \
locale-libksieve-ga \
locale-libksieve-gl \
locale-libksieve-he \
locale-libksieve-hi \
locale-libksieve-hu \
locale-libksieve-ia \
locale-libksieve-is \
locale-libksieve-it \
locale-libksieve-ja \
locale-libksieve-ka \
locale-libksieve-kk \
locale-libksieve-km \
locale-libksieve-ko \
locale-libksieve-lt \
locale-libksieve-lv \
locale-libksieve-mk \
locale-libksieve-mr \
locale-libksieve-ms \
locale-libksieve-nb \
locale-libksieve-nds \
locale-libksieve-ne \
locale-libksieve-nl \
locale-libksieve-nn \
locale-libksieve-pa \
locale-libksieve-pl \
locale-libksieve-pt \
locale-libksieve-pt-BR \
locale-libksieve-ro \
locale-libksieve-ru \
locale-libksieve-sk \
locale-libksieve-sl \
locale-libksieve-sq \
locale-libksieve-sr \
locale-libksieve-sr@ijekavian \
locale-libksieve-sr@ijekavianlatin \
locale-libksieve-sr@latin \
locale-libksieve-sv \
locale-libksieve-ta \
locale-libksieve-tr \
locale-libksieve-ug \
locale-libksieve-uk \
locale-libksieve-zh-CN \
locale-libksieve-zh-TW"

RDEPENDS:${PN} += "libksieve"

inherit rpm
