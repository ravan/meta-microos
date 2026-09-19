SUMMARY = "Translations for package ktimetracker"
DESCRIPTION = "Provides translations for the 'ktimetracker' package."
LICENSE = "GPL-2.0-or-later"

PV = "6.0.0"

RPM_NAME = "ktimetracker-lang-6.0.0-1.5.noarch.rpm"
RPM_HASH = "4ecda518b06af0b640355f18da1997de67effb96ed0c612a9592aec716f2964c214ce005ca54bb6ff9859b480e5a0392c2badad6440946967381aae1291a6ad6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktimetracker-lang \
ktimetracker-lang-all \
locale-ktimetracker-af \
locale-ktimetracker-ar \
locale-ktimetracker-ast \
locale-ktimetracker-be \
locale-ktimetracker-bg \
locale-ktimetracker-br \
locale-ktimetracker-bs \
locale-ktimetracker-ca \
locale-ktimetracker-ca@valencia \
locale-ktimetracker-cs \
locale-ktimetracker-cy \
locale-ktimetracker-da \
locale-ktimetracker-de \
locale-ktimetracker-el \
locale-ktimetracker-en-GB \
locale-ktimetracker-eo \
locale-ktimetracker-es \
locale-ktimetracker-et \
locale-ktimetracker-eu \
locale-ktimetracker-fa \
locale-ktimetracker-fi \
locale-ktimetracker-fr \
locale-ktimetracker-ga \
locale-ktimetracker-gl \
locale-ktimetracker-he \
locale-ktimetracker-hi \
locale-ktimetracker-hr \
locale-ktimetracker-hu \
locale-ktimetracker-ia \
locale-ktimetracker-is \
locale-ktimetracker-it \
locale-ktimetracker-ja \
locale-ktimetracker-ka \
locale-ktimetracker-kk \
locale-ktimetracker-km \
locale-ktimetracker-ko \
locale-ktimetracker-lt \
locale-ktimetracker-lv \
locale-ktimetracker-mai \
locale-ktimetracker-mk \
locale-ktimetracker-mr \
locale-ktimetracker-ms \
locale-ktimetracker-nb \
locale-ktimetracker-nds \
locale-ktimetracker-ne \
locale-ktimetracker-nl \
locale-ktimetracker-nn \
locale-ktimetracker-pa \
locale-ktimetracker-pl \
locale-ktimetracker-pt \
locale-ktimetracker-pt-BR \
locale-ktimetracker-ro \
locale-ktimetracker-ru \
locale-ktimetracker-sk \
locale-ktimetracker-sl \
locale-ktimetracker-sv \
locale-ktimetracker-ta \
locale-ktimetracker-th \
locale-ktimetracker-tr \
locale-ktimetracker-ug \
locale-ktimetracker-uk \
locale-ktimetracker-zh-CN \
locale-ktimetracker-zh-TW"

RDEPENDS:${PN} += "ktimetracker"

inherit rpm
