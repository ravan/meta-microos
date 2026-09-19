SUMMARY = "Translations for package umbrello"
DESCRIPTION = "Provides translations for the 'umbrello' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only & GPL-3.0-or-later"

PV = "26.08.1"

RPM_NAME = "umbrello-lang-26.08.1-1.1.noarch.rpm"
RPM_HASH = "c09d25c92403addff4188ccf383f2bd31fefd2e7831f55cc736804fce20394a7d7bdab04fdf599a9eabb731ebf263f261ebd3c6d02d79dbb63c962c16898a236"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-umbrello-ar \
locale-umbrello-be \
locale-umbrello-br \
locale-umbrello-bs \
locale-umbrello-ca \
locale-umbrello-ca@valencia \
locale-umbrello-cs \
locale-umbrello-cy \
locale-umbrello-da \
locale-umbrello-de \
locale-umbrello-el \
locale-umbrello-en-GB \
locale-umbrello-eo \
locale-umbrello-es \
locale-umbrello-et \
locale-umbrello-eu \
locale-umbrello-fa \
locale-umbrello-fi \
locale-umbrello-fr \
locale-umbrello-ga \
locale-umbrello-gl \
locale-umbrello-he \
locale-umbrello-hi \
locale-umbrello-hr \
locale-umbrello-hu \
locale-umbrello-ia \
locale-umbrello-it \
locale-umbrello-ja \
locale-umbrello-ka \
locale-umbrello-kk \
locale-umbrello-km \
locale-umbrello-ko \
locale-umbrello-lt \
locale-umbrello-mai \
locale-umbrello-mk \
locale-umbrello-mr \
locale-umbrello-ms \
locale-umbrello-nb \
locale-umbrello-nds \
locale-umbrello-ne \
locale-umbrello-nl \
locale-umbrello-nn \
locale-umbrello-oc \
locale-umbrello-pl \
locale-umbrello-pt \
locale-umbrello-pt-BR \
locale-umbrello-ro \
locale-umbrello-ru \
locale-umbrello-sk \
locale-umbrello-sl \
locale-umbrello-sq \
locale-umbrello-sv \
locale-umbrello-ta \
locale-umbrello-th \
locale-umbrello-tr \
locale-umbrello-ug \
locale-umbrello-uk \
locale-umbrello-zh-CN \
locale-umbrello-zh-TW \
umbrello-lang \
umbrello-lang-all"

RDEPENDS:${PN} += "umbrello"

inherit rpm
