SUMMARY = "Translations for package kbibtex"
DESCRIPTION = "Provides translations for the 'kbibtex' package."
LICENSE = "GPL-2.0-only"

PV = "0.10.50git.20260801T020758~7ee937e1"

RPM_NAME = "kbibtex-lang-0.10.50git.20260801T020758~7ee937e1-1.1.noarch.rpm"
RPM_HASH = "fc9b364ca4791c480e68bf4954720ffb8a4d6e1ff80f0265efcb46a2d0bb80178ce0145c187810226cef8d908735d69f6b288a61cb9a3beed95c783a739b1ad4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbibtex-lang \
kbibtex-lang-all \
locale-kbibtex-ar \
locale-kbibtex-bs \
locale-kbibtex-ca \
locale-kbibtex-ca@valencia \
locale-kbibtex-cs \
locale-kbibtex-da \
locale-kbibtex-de \
locale-kbibtex-en-GB \
locale-kbibtex-eo \
locale-kbibtex-es \
locale-kbibtex-et \
locale-kbibtex-eu \
locale-kbibtex-fi \
locale-kbibtex-fr \
locale-kbibtex-ga \
locale-kbibtex-gl \
locale-kbibtex-hu \
locale-kbibtex-ia \
locale-kbibtex-it \
locale-kbibtex-ja \
locale-kbibtex-ka \
locale-kbibtex-ko \
locale-kbibtex-lt \
locale-kbibtex-nb \
locale-kbibtex-nds \
locale-kbibtex-nl \
locale-kbibtex-pl \
locale-kbibtex-pt \
locale-kbibtex-pt-BR \
locale-kbibtex-ru \
locale-kbibtex-sk \
locale-kbibtex-sl \
locale-kbibtex-sv \
locale-kbibtex-tr \
locale-kbibtex-uk \
locale-kbibtex-zh-CN \
locale-kbibtex-zh-TW"

RDEPENDS:${PN} += "kbibtex"

inherit rpm
