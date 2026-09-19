SUMMARY = "Translations for package hello"
DESCRIPTION = "Provides translations for the 'hello' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.12.3"

RPM_NAME = "hello-lang-2.12.3-1.4.noarch.rpm"
RPM_HASH = "c0f1e3b6e9d209ddf7f957f1fea3cfcdb363f9022e91453db14cb60848a4827bae45f78688f333eac87dbff9c27ad5f270a7f0c47dd4d17cd7c7a7b4935308a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hello-lang \
hello-lang-all \
locale-hello-ast \
locale-hello-bg \
locale-hello-ca \
locale-hello-cs \
locale-hello-da \
locale-hello-de \
locale-hello-el \
locale-hello-eo \
locale-hello-es \
locale-hello-et \
locale-hello-eu \
locale-hello-fa \
locale-hello-fi \
locale-hello-fr \
locale-hello-ga \
locale-hello-gl \
locale-hello-he \
locale-hello-hr \
locale-hello-hu \
locale-hello-id \
locale-hello-it \
locale-hello-ja \
locale-hello-ka \
locale-hello-ko \
locale-hello-lv \
locale-hello-ms \
locale-hello-nb \
locale-hello-nl \
locale-hello-nn \
locale-hello-pl \
locale-hello-pt \
locale-hello-pt-BR \
locale-hello-ro \
locale-hello-ru \
locale-hello-sk \
locale-hello-sl \
locale-hello-sr \
locale-hello-sv \
locale-hello-ta \
locale-hello-th \
locale-hello-tr \
locale-hello-uk \
locale-hello-vi \
locale-hello-zh-CN \
locale-hello-zh-TW"

RDEPENDS:${PN} += "hello"

inherit rpm
