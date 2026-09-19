SUMMARY = "Translations for package neovim"
DESCRIPTION = "Provides translations for the 'neovim' package."
LICENSE = "Apache-2.0 & Vim & GPL-3.0-or-later & CC-BY-3.0"

PV = "0.12.5"

RPM_NAME = "neovim-lang-0.12.5-1.1.noarch.rpm"
RPM_HASH = "8c05075f9aec67d4d0ad11c3a02c7374786c400a1044f034a568320e1d58a3adead895a6a4f53a9cc9707c59da1de126c937a5b5d1e31313e50e0475c67e8e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-neovim-af \
locale-neovim-ca \
locale-neovim-cs \
locale-neovim-da \
locale-neovim-de \
locale-neovim-en-GB \
locale-neovim-eo \
locale-neovim-es \
locale-neovim-fi \
locale-neovim-fr \
locale-neovim-ga \
locale-neovim-it \
locale-neovim-ja \
locale-neovim-nb \
locale-neovim-nl \
locale-neovim-pt-BR \
locale-neovim-ru \
locale-neovim-sk \
locale-neovim-sv \
locale-neovim-tr \
locale-neovim-uk \
locale-neovim-vi \
neovim-lang \
neovim-lang-all"

RDEPENDS:${PN} += "neovim"

inherit rpm
